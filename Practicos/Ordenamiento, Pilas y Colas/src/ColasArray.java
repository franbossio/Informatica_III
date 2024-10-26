import java.util.*;
public class ColasArray {

    private List<Pedido> a;
    private int currentSize;
    private int front;
    private int back;
    private static final int DEFAULT_CAPACITY=10;

    private int increment(List x){
        if(++x==a.size()){
            x=0;
        }
        return x;
    }

    public ColasArray(){
        a= new ArrayList<>();
        makeEmpty();
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public void enqueue(List x){
        if(currentSize==a.size()){
            doubleQueue();
        }
        back=increment(back);
        a[back]=x;
        a.
        currentSize++;
    }

    private void doubleQueue(){
        int [] newArray;
        newArray=(int [])new int[a.length*2];
        for(int i=0;i<currentSize;i++, front=increment(front)){
            newArray[i]=a[front];
        }
        a=newArray;
        front=0;
        back=currentSize-1;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new UnderflowException("ArrayQueue dequeue");
        }
        currentSize--;
        int returnValue=a[front];
        front=increment(front);
        return returnValue;
    }
    public int getFront() {
        if(isEmpty()){
            throw new UnderflowException("ArrayQueue dequeue");
        }
        return a[front];
    }

    public void makeEmpty(){
        currentSize=0;
        front=0;
        back=-1;
    }
}