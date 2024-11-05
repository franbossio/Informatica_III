package ArbolBinarioAVL;

public class NodoAVL {
    int valor;
    int altura;
    NodoAVL izq;
    NodoAVL der;

    public NodoAVL(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}
