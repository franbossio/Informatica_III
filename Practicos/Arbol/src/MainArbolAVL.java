public class MainArbolAVL {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        
        // Insertando nodos
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        
        // Imprimiendo el árbol en orden
        System.out.println("Árbol en orden:");
        arbol.inOrden();
        
        // Eliminando un nodo
        arbol.eliminar(40);
        
        // Imprimiendo el árbol en orden después de eliminar
        System.out.println("\nÁrbol después de eliminar 40:");
        arbol.inOrden();
    }
}
