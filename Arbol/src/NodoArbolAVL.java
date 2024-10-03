public class NodoArbolAVL {
    public int dato;
    public int fe;
    public NodoArbolAVL izq;
    public NodoArbolAVL der;

    public NodoArbolAVL(int dato){
        this.dato=dato;
        izq=null;
        der=null;
        fe=0;
    }
}
