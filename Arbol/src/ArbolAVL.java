public class ArbolAVL {
    private NodoArbolAVL root;
    
    public ArbolAVL(){
        root=null;
    }

    public NodoArbolAVL getRoot() {
        return root;
    }

    //buscar un nodo
    public NodoArbolAVL buscar(int d, NodoArbolAVL r){
        if(root==null){
            return null;
        }else{
            if(r.dato==d){
                return r;
            }
            if(r.dato<d){
                return buscar(d,r.der);
            }else{
                return buscar(d,r.izq);
            }
        }

    }

    //obtener el factor de equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }

    //rotacion simple izquierda
    public NodoArbolAVL RSI(NodoArbolAVL c){
        NodoArbolAVL aux=c.izq;
        c.izq=aux.der;
        aux.der=c;
        c.fe=Math.max(obtenerFE(c.izq), obtenerFE(c.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion simple derecha
    public NodoArbolAVL RSD(NodoArbolAVL c){
        NodoArbolAVL aux=c.der;
        c.der=aux.izq;
        aux.izq=c;
        c.fe=Math.max(obtenerFE(c.izq), obtenerFE(c.der))+1;
        aux.fe=Math.max(obtenerFE(aux.izq), obtenerFE(aux.der))+1;
        return aux;
    }

    //rotacion doble a la izquierda
    public NodoArbolAVL RDI(NodoArbolAVL c){
        NodoArbolAVL aux;
        c.izq=RSD(c.izq);
        aux=RSI(c);
        return aux;
    }

    //rotacion doble a la derecha
    public NodoArbolAVL RDD(NodoArbolAVL c){
        NodoArbolAVL aux;
        c.der=RSI(c.der);
        aux=RSD(c);
        return aux;
    }

    //metodo para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.dato<subAr.dato){
            if(subAr.izq=null){
                subAr.der=nuevo;
            }else{
                subAr.izq=insertarAVL(nuevo, subAr.izq);
                if((obtenerFE(subAr.izq)-obtenerFE(subAr.der))==2){
                    if(nuevo.dato<subAr.izq.dato){
                        nuevoPadre=RSI(subAr);
                    }else{
                        nuevoPadre=RDI(subAr);
                    }
                }
            }
        }else if(nuevo.dato>subAr.dato){
            if(subAr.der==null){
                subAr.der=nuevo;
            }else{
                subAr.der=insertarAVL(nuevo, subAr.der);
                if((obtenerFE(subAr.der)-obtenerFE(subAr.izq))==2){
                    if(nuevo.dato>subAr.der.dato){
                        nuevoPadre=RSD(subAr);
                    }else{
                        nuevoPadre=RDD(subAr);
                    }
                }
            }
        }else{
            System.out.println("Nodo Duplicado");
        }
        //actualizando la altura o el factor de equilibrio
        if(subAr.izq==null && subAr.der!=null){
            subAr.fe=subAr.der.fe+1;
        }else if(subAr.der==null && subAr.izq!=null){
            subAr.fe=subAr.izq.fe+1;
        }else{
            subAr.fe=Math.max(obtenerFE(subAr.izq), obtenerFE(subAr.der))+1;
        }
        return nuevoPadre;

    }

    //metodo para insertar
    public void insertar(int d){
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if(root==null){
            root=nuevo;
        }else{
            root=insertarAVL(nuevo, root);
        }
    }

    public void preorden(NodoArbolAVL  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            System.out.print(nodo.element+", ");
            preorden(nodo.izq);
            preorden(nodo.der);
        }
    }

    public void inorden(NodoArbolAVL  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            inorden(nodo.izq);
            System.out.print(nodo.element+", ");
            inorden(nodo.der);
        }
    }

    public void postorden(NodoArbolAVL  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.print(nodo.element+", ");
        }
    }
}