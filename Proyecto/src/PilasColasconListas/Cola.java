package PilasColasconListas;

public class Cola<T> {
    private Nodo<T> front;
    private Nodo<T> back;

    public Cola(){
        this.front=null;
        this.back=null;
    }

    //ingresar un valor a la cola
    public void enqueue(T x){
        Nodo<T> new_Nodo = new Nodo<>(x);
        if(isEmpty()){   
            back=new_Nodo;
            front=back;
        }else{
            back.next = new_Nodo;  // Aquí apuntas el siguiente nodo de 'back' al nuevo nodo
            back = new_Nodo;  // Luego, actualizas el 'back' al nuevo nodo
        }
    }

    public boolean isEmpty(){
        return front==null && back==null;
    }

    //eleminar y mostrar el valor eliminado 
    public T dequeue(){
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            T aux = front.dato;
            front=front.next;
            if (front == null) {
                back = null;
            }
            return aux;
        }
    }

    //obtener el frente (primer valor ingresado) de la lista
    public T getFront() {
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            return front.dato;
        }
       
    }

    //mostrar la cola completa
    public void mostrarCola(){
        Nodo<T> aux_Nodo=front;
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            while (aux_Nodo!=null) {
                System.out.println(aux_Nodo.dato);
                aux_Nodo=aux_Nodo.next;
            }
        }
    }

    //hacer vacia la cola
    public void makeEmpty(){
        front = null;
        back = null;
    }
}
