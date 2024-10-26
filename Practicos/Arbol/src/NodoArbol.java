public class NodoArbol {
    public int element;
    public NodoArbol izq;
    public NodoArbol der;

    public NodoArbol(int element){
        this.element=element;
        izq=null;
        der=null;
    }

   public void insertar(int valor){
        //insertar en el lado izq
        if(valor<this.element){
            if(this.izq==null){
                this.izq=new NodoArbol(valor);
            }else{
                this.izq.insertar(valor);
            }
        }else{
            //insertar en el lado derecho
            if(this.der==null){
                this.der=new NodoArbol(valor);
            }else{
                this.der.insertar(valor);
            }
        }
    }
}
