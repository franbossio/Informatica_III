package PilasColasconListas;

public class Cola<T> {
    private Nodo<T> front;
    private Nodo<T> back;

    public Cola(){
        this.front=null;
        this.back=null;
    }
}
