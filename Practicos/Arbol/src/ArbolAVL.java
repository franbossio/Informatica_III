public class ArbolAVL {
    private NodoArbolAVL root;

    public ArbolAVL(){
        root=null;
    }

    //buscar un nodo
    public NodoArbolAVL buscar(int d, NodoArbolAVL r){
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
    public int obtenerFE(NodoArbolAVL r){
        if(r==null){
            return -1;
        }else{
            return r.fe;
        }
    }

    //rotacion simple izquierda
    public NodoArbolAVL RSI(NodoArbolAVL r){
        NodoArbolAVL aux = r.izq;
        r.izq=aux.der;
        aux.der=r;
        r.fe=Math.max(obtenerFE(r.izq), obtenerFE(r.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion simple derecha
    public NodoArbolAVL RSD(NodoArbolAVL r){
        NodoArbolAVL aux = r.der;
        r.der=aux.izq;
        aux.izq=r;
        r.fe=Math.max(obtenerFE(r.izq), obtenerFE(r.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion doble izquierda
    public NodoArbolAVL RDI(NodoArbolAVL r){
        NodoArbolAVL aux;
        r.izq=RSD(r.izq);
        aux=RSI(r);
        return aux;
    }   

    //rotacion doble derecha
    public NodoArbolAVL RDD(NodoArbolAVL r){
        NodoArbolAVL aux;
        r.der=RSI(r.der);
        aux=RSD(r);
        return aux;
    }   

    //insertar avl
    public NodoArbolAVL insertar(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.dato<subAr.dato){
            if(subAr.izq==null){
                subAr.izq=nuevo;
            }else{
                subAr.izq=insertar(nuevo, subAr.izq);
                if(ObtenerFE(subAr.izq))
            }
        }
    }
}

