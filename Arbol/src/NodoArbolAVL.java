public class NodoArbolAVL {
    int clave, altura;
    NodoArbolAVL izquierdo, derecho;

    public NodoArbolAVL(int clave) {
        this.clave = clave;
        this.altura = 1;  // Los nodos recién creados tienen altura 1
    }
}
