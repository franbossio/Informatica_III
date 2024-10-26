class NodoAVL {
    int valor;
    int altura;
    NodoAVL izquierda;
    NodoAVL derecha;

    NodoAVL(int valor) {
        this.valor = valor;
        this.altura = 1; // Un nodo nuevo tiene altura 1
    }
}