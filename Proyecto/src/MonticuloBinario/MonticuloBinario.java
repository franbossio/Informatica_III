package MonticuloBinario;
import java.util.NoSuchElementException;

public class MonticuloBinario {
    private static final int DEFAULT_CAPACITY = 100;
    private int currentSize;
    private int[] array;

    public MonticuloBinario() {
        currentSize = 0;
        array = new int[DEFAULT_CAPACITY + 1];
    }

    // Retorna el menor valor del arreglo
    public int buscar_minimo() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return array[1];
        }
    }

    // Pregunta si el arreglo está vacío
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Agrega un número al arreglo
    public void agregar(int n) {
        if (currentSize + 1 == array.length) {
            doubleArray();
        }
        int pos = ++currentSize;
        while (pos > 1 && n < array[pos / 2]) {
            array[pos] = array[pos / 2];
            pos /= 2;
        }
        array[pos] = n;
    }

    // Eliminar el mínimo
    public int eliminar() {
        int minimo = buscar_minimo();
        array[1] = array[currentSize--];
        percolateDown(1);
        return minimo;
    }

    private void percolateDown(int pos) {
        int child;
        int aux = array[pos];
        while (pos * 2 <= currentSize) {
            child = pos * 2;
            if (child != currentSize && array[child + 1] < array[child]) {
                child++;
            }
            if (array[child] < aux) {
                array[pos] = array[child];
            } else {
                break;
            }
            pos = child;
        }
        array[pos] = aux;
    }

    // Imprimir el arreglo
    public void imprimir() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            for (int i = 1; i <= currentSize; i++) {
                System.out.println(array[i]);
            }
        }
    }

    private void doubleArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 1, newArray, 1, currentSize);
        array = newArray;
    }
}

