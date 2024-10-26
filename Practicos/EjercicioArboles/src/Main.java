public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);

        // Imprimir el árbol en orden para verificar la estructura
        arbol.imprimirEnOrden();
    }
}
