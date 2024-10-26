class ArbolAVL {
    NodoAVL raiz;

    // Método para obtener la altura de un nodo
    int obtenerAltura(NodoAVL nodo) {
        return (nodo == null) ? 0 : nodo.altura;
    }

    // Método para obtener el factor de balance de un nodo
    int obtenerFactorBalance(NodoAVL nodo) {
        return (nodo == null) ? 0 : obtenerAltura(nodo.izquierda) - obtenerAltura(nodo.derecha);
    }

    // Rotación simple a la derecha
    NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = y.izquierda;
        NodoAVL T2 = x.derecha;

        // Realizar la rotación
        x.derecha = y;
        y.izquierda = T2;

        // Actualizar alturas
        y.altura = Math.max(obtenerAltura(y.izquierda), obtenerAltura(y.derecha)) + 1;
        x.altura = Math.max(obtenerAltura(x.izquierda), obtenerAltura(x.derecha)) + 1;

        // Retornar la nueva raíz
        return x;
    }

    // Rotación simple a la izquierda
    NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = x.derecha;
        NodoAVL T2 = y.izquierda;

        // Realizar la rotación
        y.izquierda = x;
        x.derecha = T2;

        // Actualizar alturas
        x.altura = Math.max(obtenerAltura(x.izquierda), obtenerAltura(x.derecha)) + 1;
        y.altura = Math.max(obtenerAltura(y.izquierda), obtenerAltura(y.derecha)) + 1;

        // Retornar la nueva raíz
        return y;
    }

    // Método para insertar un valor en el árbol AVL
    NodoAVL insertar(NodoAVL nodo, int valor) {
        // Realizar la inserción como en un árbol binario de búsqueda
        if (nodo == null) {
            return new NodoAVL(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertar(nodo.derecha, valor);
        } else {
            // Si el valor ya existe, no se permite duplicados
            return nodo;
        }

        // Actualizar la altura del nodo actual
        nodo.altura = 1 + Math.max(obtenerAltura(nodo.izquierda), obtenerAltura(nodo.derecha));

        // Obtener el factor de balance para este nodo
        int factorBalance = obtenerFactorBalance(nodo);

        // Caso LL (rotación simple a la derecha)
        if (factorBalance > 1 && valor < nodo.izquierda.valor) {
            return rotacionDerecha(nodo);
        }

        // Caso RR (rotación simple a la izquierda)
        if (factorBalance < -1 && valor > nodo.derecha.valor) {
            return rotacionIzquierda(nodo);
        }

        // Caso LR (rotación izquierda-derecha)
        if (factorBalance > 1 && valor > nodo.izquierda.valor) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }

        // Caso RL (rotación derecha-izquierda)
        if (factorBalance < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        // Retornar el nodo (sin cambios si está balanceado)
        return nodo;
    }

    // Método público para insertar un valor en el árbol AVL
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    // Método para imprimir el árbol en orden (para ver los valores)
    void enOrden(NodoAVL nodo) {
        if (nodo != null) {
            enOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            enOrden(nodo.derecha);
        }
    }

    // Método público para imprimir el árbol
    public void imprimirEnOrden() {
        enOrden(raiz);
        System.out.println();
    }

    // Método para obtener el nodo con el valor mínimo en un subárbol
    NodoAVL obtenerMinimo(NodoAVL nodo) {
        NodoAVL actual = nodo;
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }
        return actual;
    }

     // Método para eliminar un valor en el árbol AVL
     NodoAVL eliminar(NodoAVL nodo, int valor) {
        // Paso 1: Realizar la eliminación como en un árbol binario de búsqueda
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = eliminar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminar(nodo.derecha, valor);
        } else {
            // Nodo con el valor encontrado
            if ((nodo.izquierda == null) || (nodo.derecha == null)) {
                NodoAVL temp = (nodo.izquierda != null) ? nodo.izquierda : nodo.derecha;

                // Nodo sin hijos o con un solo hijo
                if (temp == null) {
                    nodo = null;
                } else {
                    nodo = temp;
                }
            } else {
                // Nodo con dos hijos: obtener el sucesor en orden (el más pequeño en el subárbol derecho)
                NodoAVL temp = obtenerMinimo(nodo.derecha);

                // Copiar el valor del sucesor en el nodo actual
                nodo.valor = temp.valor;

                // Eliminar el sucesor en el subárbol derecho
                nodo.derecha = eliminar(nodo.derecha, temp.valor);
            }
        }

        // Si el nodo eliminado era un nodo hoja
        if (nodo == null) {
            return nodo;
        }

        // Paso 2: Actualizar la altura del nodo actual
        nodo.altura = Math.max(obtenerAltura(nodo.izquierda), obtenerAltura(nodo.derecha)) + 1;

        // Paso 3: Obtener el factor de balance para este nodo
        int factorBalance = obtenerFactorBalance(nodo);

        // Caso LL (rotación simple a la derecha)
        if (factorBalance > 1 && obtenerFactorBalance(nodo.izquierda) >= 0) {
            return rotacionDerecha(nodo);
        }

        // Caso LR (rotación izquierda-derecha)
        if (factorBalance > 1 && obtenerFactorBalance(nodo.izquierda) < 0) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }

        // Caso RR (rotación simple a la izquierda)
        if (factorBalance < -1 && obtenerFactorBalance(nodo.derecha) <= 0) {
            return rotacionIzquierda(nodo);
        }

        // Caso RL (rotación derecha-izquierda)
        if (factorBalance < -1 && obtenerFactorBalance(nodo.derecha) > 0) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        // Retornar el nodo (sin cambios si está balanceado)
        return nodo;
    }

    // Método público para eliminar un valor en el árbol AVL
    public void eliminar(int valor) {
        raiz = eliminar(raiz, valor);
    }
}
