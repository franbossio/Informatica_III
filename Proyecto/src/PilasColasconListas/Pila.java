package PilasColasconListas;

public class Pila<T> {
    private Nodo<T> topOfStack;

    public Pila(){
        this.topOfStack=null;
    }

    public void push(T x){
        Nodo<T> new_Nodo = new Nodo<>(x);
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

   public T top(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            return topOfStack.dato;
        }
    }

    public T topAndPop(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            T valor=topOfStack.dato;
            topOfStack=topOfStack.next;
            return valor;
        }
    }

    public void makeEmpty(){
        topOfStack=null;
    }

    public void mostrarPila(){
        Nodo<T> auxNodo=topOfStack;
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
