public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
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
        arbol.dispararPreorden();
    }
}
