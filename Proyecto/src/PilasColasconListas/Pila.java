package PilasColasconListas;

public class Pila {
    private Nodo topOfStack;

    public Pila(){
        topOfStack=null;
    }

    public void push(int x){
        Nodo new_Nodo = new Nodo(x);
        new_Nodo.next=topOfStack;
        topOfStack=new_Nodo;
    }

    public boolean isEmpty(){
        return topOfStack==null;
    }

    public void pop(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            topOfStack=topOfStack.next;
        }
    }

   public int top(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            return topOfStack.dato;
        }
    }

    public int topAndPop(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            int valor=topOfStack.dato;
            topOfStack=topOfStack.next;
            return valor;
        }
    }

    public void makeEmpty(){
        topOfStack=null;
    }

    public void mostrarPila(){
        Nodo auxNodo=topOfStack;
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            while (auxNodo!=null) {
                System.out.println(auxNodo.dato);
                auxNodo=auxNodo.next;
            }
        }
       
    }

}
