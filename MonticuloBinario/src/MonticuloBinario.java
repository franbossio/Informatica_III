import java.util.NoSuchElementException;

public class MonticuloBinario {
    private static final int DEFAULT_CAPACITY=100;
    private int currentSize;
    private int [] array;

    public MonticuloBinario(){
        currentSize=0;
        array=(int []) new int[DEFAULT_CAPACITY+1];
    }

    //retorna el menor valor del arreglo
    public int buscar_minimo(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            return array[1];
        }
    }

    //pregunta si el arreglo esta vacio
    public boolean isEmpty(){
        return currentSize==0;
    }

    //agrega un numero al arreglo
    public void agregar(int n){
        if(currentSize + 1 == array.length ){
            doubleArray();
        }else{
            int pos=currentSize+1;
            for(;n<array[pos/2] && pos>=1; pos/=2){
                array[pos]=array[pos/2];
            }
            array[pos]=n;
            currentSize++;
        }
    }

    //eliminar el minimo
    public int eliminar(){
        int minimo=buscar_minimo();
        array[1]=array[currentSize--];
        percolateDown(1);
        return minimo;
    }

    private void percolateDown(int pos){
        int child;
        int aux=array[pos];
        for(;pos*2<=currentSize;pos=child){
            child=pos*2;
            if(child != currentSize && array[child+1]<array[child]){
                child++;
            }
            if(array[child]<aux){
                array[pos]=array[child];
            }else{
                break;
            }
            array[pos]=aux;
        }
    }

    //imprimir el arreglo
    public void imprimir(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            for (int i=1;i<currentSize+1;i++) {
                System.err.println(array[i]);
            }
        }
        
    }
    private void doubleArray(){
        array=(int []) new int[array.length*2];
    }
}
