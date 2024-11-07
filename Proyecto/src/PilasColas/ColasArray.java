package PilasColas;

import PilasColasconListas.UnderflowException;

public class ColasArray {
    private int[] array;       
    private int front;       
    private int back;           
    private int currentSize;     
    private final int DEFAULT_CAPACITY = 100;       

 
    public ColasArray() {
        array = new int[DEFAULT_CAPACITY];
        front = 0;
        back = -1;
        currentSize = 0;
    }

    public void makeEmpty(){
        front=0;
        back=-1;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(int x) {
        if (currentSize == array.length) {
            doubleArray();
        }
        // Incrementar el índice de back y agregar el elemento
        back++;
        array[back] = x;
        currentSize++;
    }

    // Método para eliminar el elemento al frente de la cola
    public int dequeue() {
        if (isEmpty()) {
           throw new UnderflowException("ArrayQueue empty");
        }
        // Almacenar el elemento en el frente y luego incrementar el índice de front
        int elementoFrente = array[front];
        front++;
        currentSize--;
        return elementoFrente;
    }

    // Método para ver el elemento al frente sin eliminarlo
    public int mostrarFrente() {
        if (isEmpty()) {
            throw new UnderflowException("ArrayQueue empty");
        }
        return array[front];
    }
     // Método para mostrar todos los elementos de la cola sin modificarlos
    public void mostrarCola() {
        if (isEmpty()) {
            throw new UnderflowException("ArrayQueue empty");
        }
        System.out.print("Elementos en la cola: ");
        for (int i = front; i <= back; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void doubleArray(){
        array = (int []) new int[array.length*2];
    }

    public void shellsort() {
        int n = currentSize;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[front + i]; // Elemento a insertar
                int j;
                for (j = i; j >= gap && array[front + j - gap] > temp; j -= gap) {
                    array[front + j] = array[front + j - gap];
                }
                array[front + j] = temp;
            }
        }
    }

    public void transferir(ColasArray otraCola) {
        while (!this.isEmpty()) {
            int elemento = this.dequeue();
            otraCola.enqueue(elemento);
        }
    }
}
