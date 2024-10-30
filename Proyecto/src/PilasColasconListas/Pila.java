package PilasColasconListas;

public class Pila {
    private Nodo topOfStack;
    private Nodo2 tos;

    public Pila(){
        topOfStack=null;
        tos=null;
    }

    //ingresar dato de tipo string
    public void push(String x){
        Nodo2 new_Nodo = new Nodo2(x);
        new_Nodo.next=tos;
        tos=new_Nodo;
    }

    public void push(int x){
        Nodo new_Nodo = new Nodo(x);
        new_Nodo.next=topOfStack;
        topOfStack=new_Nodo;
    }

    public boolean isEmpty(){
        return topOfStack==null;
    }

    public boolean isEmptyString(){
        return tos==null;
    }

    public void pop(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            topOfStack=topOfStack.next;
        }
    }

    //eliminar un string
    public void popString(){
        if(isEmptyString()){
            throw new UnderflowException("Stack empty");
        }else{
            tos=tos.next;
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

    public String topAndPop2(){
        if(isEmptyString()){
            throw new UnderflowException("Stack empty");
        }else{
            String valor=tos.cadena;
            tos=tos.next;
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
