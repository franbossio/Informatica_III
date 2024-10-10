public class ArbolAVL {
    private NodoArbolAVL raiz;

    // Método para insertar un nodo
    public void insertar(int clave) {
        raiz = insertarRec(raiz, clave);
    }

    private NodoArbolAVL insertarRec(NodoArbolAVL nodo, int clave) {
        // Inserción normal en árbol binario de búsqueda
        if (nodo == null)
            return new NodoArbolAVL(clave);

        if (clave < nodo.clave)
            nodo.izquierdo = insertarRec(nodo.izquierdo, clave);
        else if (clave > nodo.clave)
            nodo.derecho = insertarRec(nodo.derecho, clave);
        else
            return nodo;

        // Actualizar la altura del nodo padre
        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));

        // Balancear el árbol
        return balancear(nodo, clave);
    }

    // Método para eliminar un nodo
    public void eliminar(int clave) {
        raiz = eliminarRec(raiz, clave);
    }

    private NodoArbolAVL eliminarRec(NodoArbolAVL nodo, int clave) {
        if (nodo == null)
            return nodo;

        if (clave < nodo.clave)
            nodo.izquierdo = eliminarRec(nodo.izquierdo, clave);
        else if (clave > nodo.clave)
            nodo.derecho = eliminarRec(nodo.derecho, clave);
        else {
            if ((nodo.izquierdo == null) || (nodo.derecho == null)) {
                NodoArbolAVL temp = null;
                if (temp == nodo.izquierdo)
                    temp = nodo.derecho;
                else
                    temp = nodo.izquierdo;

                if (temp == null) {
                    temp = nodo;
                    nodo = null;
                } else
                    nodo = temp;
            } else {
                NodoArbolAVL temp = nodoConClaveMinima(nodo.derecho);
                nodo.clave = temp.clave;
                nodo.derecho = eliminarRec(nodo.derecho, temp.clave);
            }
        }

        if (nodo == null)
            return nodo;

        // Actualizar la altura del nodo
        nodo.altura = Math.max(altura(nodo.izquierdo), altura(nodo.derecho)) + 1;

        // Balancear el árbol
        return balancear(nodo, clave);
    }

    // Método para encontrar el nodo con el valor mínimo
    private NodoArbolAVL nodoConClaveMinima(NodoArbolAVL nodo) {
        NodoArbolAVL actual = nodo;
        while (actual.izquierdo != null)
            actual = actual.izquierdo;
        return actual;
    }

    // Método para balancear el árbol
    private NodoArbolAVL balancear(NodoArbolAVL nodo, int clave) {
        int balance = obtenerBalance(nodo);

        if (balance > 1 && clave < nodo.izquierdo.clave)
            return rotacionDerecha(nodo);

        if (balance < -1 && clave > nodo.derecho.clave)
            return rotacionIzquierda(nodo);

        if (balance > 1 && clave > nodo.izquierdo.clave) {
            nodo.izquierdo = rotacionIzquierda(nodo.izquierdo);
            return rotacionDerecha(nodo);
        }

        if (balance < -1 && clave < nodo.derecho.clave) {
            nodo.derecho = rotacionDerecha(nodo.derecho);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    // Rotación simple a la derecha
    private NodoArbolAVL rotacionDerecha(NodoArbolAVL y) {
        NodoArbolAVL x = y.izquierdo;
        NodoArbolAVL T2 = x.derecho;

        x.derecho = y;
        y.izquierdo = T2;

        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;

        return x;
    }

    // Rotación simple a la izquierda
    private NodoArbolAVL rotacionIzquierda(NodoArbolAVL x) {
        NodoArbolAVL y = x.derecho;
        NodoArbolAVL T2 = y.izquierdo;

        y.izquierdo = x;
        x.derecho = T2;

        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;

        return y;
    }

    // Obtener el balance de un nodo
    private int obtenerBalance(NodoArbolAVL nodo) {
        if (nodo == null)
            return 0;
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    // Obtener la altura de un nodo
    private int altura(NodoArbolAVL nodo) {
        if (nodo == null)
            return 0;
        return nodo.altura;
    }

    // Método para imprimir el árbol en orden
    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoArbolAVL nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.izquierdo);
            System.out.print(nodo.clave + " ");
            inOrdenRec(nodo.derecho);
        }
    }
}
