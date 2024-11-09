package Ordenamiento;

import java.util.*;

public class Ordenamientos<T> {

    public <T extends Comparable<T>> void quicksort(T[] a, int izq, int der) {
        // pivote
        T pivote = a[izq];
        // los elementos >al pivote van a la derecha
        // los elementos < al pivote van a la izquierda
        // variables auxiliares
        int i = izq;
        int j = der;
        T swap;
        // se evaluan los elementos para ubicr el nuevo pivote
        while (i < j) {
            // mientras que a[i] sea menor al pivote se aumenta i
            // cuando no se cumpla el while el elemento es mayor al pivote
            // y debera ir a la der
            while (a[i].compareTo(pivote) <= 0 && i < j) {
                i++;
            }
            /*
             * mientras que a[j] sea mayor al pivote se disminuye cuando no se
             * cumpla el while el elemento es menor al pivote y debera ir a la izq
             */
            while (a[j].compareTo(pivote) > 0) {
                j--;
            }
            /* siempre y cuando i sea menor a j se hace un intercambio de elementos */
            if (i < j) {
                swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        a[izq] = a[j];
        a[j] = pivote;
        if (izq < j - 1) {
            quicksort(a, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(a, j + 1, der);
        }
    }

    // Imprimir el arreglo
    public void imprimirArreglo(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }

    public <T extends Comparable<T>> void shellSort(T[] a) {
        int gap, i, j, k;
        T aux;
        gap = a.length / 2;
        while (gap > 0) {
            for (i = gap; i < a.length; i++) {
                j = i - gap;
                while (j >= 0) {
                    k = j + gap;
                    if (a[j].compareTo(a[k]) <= 0) {
                        break;
                    } else {
                        aux = a[j];
                        a[j] = a[k];
                        a[k] = aux;
                        j -= gap;
                    }
                }
            }
            gap /= 2;
        }
    }

    public <T extends Comparable<T>> void insercion(T[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j].compareTo(a[j - 1]) < 0; j--) {
                T aux = a[j - 1];
                a[j - 1] = a[j];
                a[j] = aux;
            }
        }

    }

    // ingresar valores aleatorios a un arreglo
    public Integer[] valoresAleatorio(int size) {
        Integer[] array = new Integer[size]; // Crear array con la longitud indicada
        Random random = new Random(); // Objeto Random para generar números aleatorios

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        return array; // Retorna el array cargado con números aleatorios
    }

}