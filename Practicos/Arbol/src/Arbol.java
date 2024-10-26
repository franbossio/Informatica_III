public class Arbol {
    private NodoArbol root;

    public Arbol(){
        root=null;
    }

    public void agregar(int valor){
        if(root==null){
            root = new NodoArbol(valor);
        }else{
            root.insertar(valor);
        }
    }

    public void dispararPreorden(){
        preorden(root);
    }

    public void preorden(NodoArbol  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            System.out.print(nodo.element+", ");
            preorden(nodo.izq);
            preorden(nodo.der);
        }
    }

    public void dispararInorden(){
        inorden(root);
    }

    public void inorden(NodoArbol  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            inorden(nodo.izq);
            System.out.print(nodo.element+", ");
            inorden(nodo.der);
        }
    }

    public void dispararPostorden(){
        postorden(root);
    }

    public void postorden(NodoArbol  nodo){
        if(nodo == null){
            return;//detener recursividad
        }else{
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.print(nodo.element+", ");
        }
    }

}
