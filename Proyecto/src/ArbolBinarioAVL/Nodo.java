package ArbolBinarioAVL;

public class Nodo {
    int dato;
    Nodo izq, der;
    int fe;

    Nodo(int dato) {
        this.dato = dato;
        this.fe = 0; 
        this.izq=null;
        this.der=null;
    }
}
