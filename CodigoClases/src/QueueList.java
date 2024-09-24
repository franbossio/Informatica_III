public class QueueList {
    private Nodo front;
    private Nodo back;

    public QueueList(){
        front=null;
        back=null;
    }
    //ingresar un valor a la cola
    public void enqueue(int x){
        Nodo new_Nodo = new Nodo(x);
        if(isEmpty()){   
            back=new_Nodo;
            front=back;
        }else{
            back.next = new_Nodo;  // Aquí apuntas el siguiente nodo de 'back' al nuevo nodo
            back = new_Nodo;  // Luego, actualizas el 'back' al nuevo nodo
        }
    }
    //eleminar y mostrar el valor eliminado 
    public int dequeue(){
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            int aux = front.element;
            front=front.next;
            return aux;
        }
    }
    //obtener el frente (primer valor ingresado) de la lista
    public int getFront() {
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            return front.element;
        }
       
    }
    //preguntar si la cola esta vacia
    public boolean isEmpty(){
        return front==null && back == null;
    }
    //hacer vacia la cola
    public void makeEmpty(){
        front = null;
        back = null;
    }
    //mostrar la cola completa
    public void mostrarCola(){
        Nodo aux_Nodo=front;
        if(isEmpty()){
            throw new UnderflowException("queue empty");
        }else{
            while (aux_Nodo!=null) {
                System.out.println(aux_Nodo.element);
                aux_Nodo=aux_Nodo.next;
            }
        }
    }
}
