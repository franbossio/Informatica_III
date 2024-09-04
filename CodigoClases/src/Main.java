public class Main {

    public static void main(String[] args) {
        PilasArreglo stack = new PilasArreglo();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
    }
}