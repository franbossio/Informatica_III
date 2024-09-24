public class Main {

    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.mostrarPila();
        System.out.println("-----------------------------");
        System.out.println(stack.topAndPop());
        System.out.println("-----------------------------");
        stack.mostrarPila();
        

    }
}