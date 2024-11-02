package ArbolBinarioAVL;

public class ArbolAVL {
    private Nodo root;

    public ArbolAVL(){
        root=null;
    }

    //buscar un nodo
    public Nodo buscar(int d, Nodo r){
        if(root==null){
            return null;
        }else if(r.dato==d){
            return r;
        }else if(d>r.dato){
            return buscar(d, r.der);
        }else{
            return buscar(d,r.izq);
        }
    }

    //obtener factor de equilibrio
    public int obtenerFE(Nodo r){
        if(r==null){
            return -1;
        }else{
            return r.fe;
        }
    }

    //rotacion simple izquierda
    public Nodo RSI(Nodo r){
        Nodo aux = r.izq;
        r.izq=aux.der;
        aux.der=r;
        r.fe=Math.max(obtenerFE(r.izq), obtenerFE(r.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion simple derecha
    public Nodo RSD(Nodo r){
        Nodo aux = r.der;
        r.der=aux.izq;
        aux.izq=r;
        r.fe=Math.max(obtenerFE(r.izq), obtenerFE(r.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion doble izquierda
    public Nodo RDI(Nodo r){
        Nodo aux;
        r.izq=RSD(r.izq);
        aux=RSI(r);
        return aux;
    }   

    //rotacion doble derecha
    public Nodo RDD(Nodo r){
        Nodo aux;
        r.der=RSI(r.der);
        aux=RSD(r);
        return aux;
    }   

    //insertar
    private Nodo insertarAVL(Nodo nuevo, Nodo subArbol){
        Nodo nuevoPadre=subArbol;
        if(nuevo.dato<subArbol.dato){
            if(subArbol.izq==null){
                subArbol.izq=nuevo;
            }else{
                subArbol.izq=insertarAVL(nuevo, subArbol.izq);
                if((obtenerFE(subArbol.izq)-obtenerFE(subArbol.der)) == 2){
                    if(nuevo.dato<subArbol.izq.dato){
                        nuevoPadre=RSI(subArbol);
                    }else{
                        nuevoPadre=RDI(subArbol);
                    }
                }
            }
        }else if(nuevo.dato>subArbol.dato){
            if(subArbol.der==null){
                subArbol.der=nuevo;
            }else{
                subArbol.der=insertarAVL(nuevo, subArbol.der);
                if((obtenerFE(subArbol.der)-obtenerFE(subArbol.izq)) == 2){
                    if(nuevo.dato>subArbol.der.dato){
                        nuevoPadre=RSD(subArbol);
                    }else{
                        nuevoPadre=RDD(subArbol);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }

        //actualizar el factor de equilibrio
        if((subArbol.izq==null)&&(subArbol.der!=null)){
            subArbol.fe=subArbol.der.fe+1;
        }else if((subArbol.der==null) && (subArbol.izq!=null)){
            subArbol.fe=subArbol.izq.fe+1;
        }else{
            subArbol.fe=Math.max(obtenerFE(subArbol.izq), obtenerFE(subArbol.der))+1;
        }
        return nuevoPadre;
    }

    //metodo publico para insertar
    public void insertar(int dato){
        Nodo nuevo=new Nodo(dato);
        if(root==null){
            root=nuevo;
        }else{
            root=insertarAVL(nuevo, root);
        }
    }

    //recorrer inorden
    public void dispararInorden(){
        inorden(root);
    }

    private void inorden(Nodo  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            inorden(nodo.izq);
            System.out.print(nodo.dato+", ");
            inorden(nodo.der);
        }
    }

    //eliminar un nodo 
    // Método para obtener el nodo con el valor mínimo
    private Nodo obtenerMinimo(Nodo nodo) {
        while (nodo.izq != null) {
            nodo = nodo.izq;
        }
        return nodo;
    }

    // Método para eliminar un nodo
    private Nodo eliminarAVL(Nodo nodo, int dato) {
        if (nodo == null) {
            return null;
        }

        if (dato < nodo.dato) {
            nodo.izq = eliminarAVL(nodo.izq, dato);
        } else if (dato > nodo.dato) {
            nodo.der = eliminarAVL(nodo.der, dato);
        } else {
            // Nodo encontrado
            if (nodo.izq == null || nodo.der == null) {
                nodo = (nodo.izq != null) ? nodo.izq : nodo.der;
            } else {
                Nodo temp = obtenerMinimo(nodo.der);
                nodo.dato = temp.dato;
                nodo.der = eliminarAVL(nodo.der, temp.dato);
            }
        }

        if (nodo == null) {
            return null;
        }

        // Actualizar el factor de equilibrio
        nodo.fe = Math.max(obtenerFE(nodo.izq), obtenerFE(nodo.der)) + 1;

        // Verificar el balance y realizar las rotaciones necesarias
        int balance = obtenerFE(nodo.izq) - obtenerFE(nodo.der);

        // Rotaciones según el caso
        if (balance > 1) {
            if (obtenerFE(nodo.izq.izq) >= obtenerFE(nodo.izq.der)) {
                return RSI(nodo);
            } else {
                return RDI(nodo);
            }
        }
        if (balance < -1) {
            if (obtenerFE(nodo.der.der) >= obtenerFE(nodo.der.izq)) {
                return RSD(nodo);
            } else {
                return RDD(nodo);
            }
        }

        return nodo;
    }

    // Método público para eliminar un nodo
    public void eliminar(int dato) {
        root = eliminarAVL(root, dato);
    }
}
