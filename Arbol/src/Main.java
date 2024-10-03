public class Main {
    public static void main(String[] args) {
       /* Arbol arbol = new Arbol();
        arbol.agregar(43);
        arbol.agregar(10);
        arbol.agregar(8);
        arbol.agregar(15);
        arbol.agregar(50);
        System.out.println("Inorden: ");
        arbol.dispararInorden();
        System.out.println("\nPostorden: ");
        arbol.dispararPostorden();
        System.out.println("\nPreorden: ");
        arbol.dispararPreorden();*/
        ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.insertar(10);
        arbolAVL.insertar(5);
        arbolAVL.insertar(13);
        arbolAVL.insertar(1);
        arbolAVL.insertar(6);
        arbolAVL.insertar(17);
        arbolAVL.preorden(ArbolAVL.getRoot);
    }
}
