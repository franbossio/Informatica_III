public class Main {

    public static void main(String[] args) {
        PilasArreglo stack = new PilasArreglo();
        stack.push(10);
        for (PilasArreglo pila : stack) {
            System.out.println(pila);
        }
    }
}