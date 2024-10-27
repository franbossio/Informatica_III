package Ordenamiento;

import java.util.*;

public class Ordenamientos {

    //ordeanr tipo entero
    public void quicksort(int[] a, int izq,int der){
        //pivote
        int pivote = a[izq];
        //los elementos >al pivote van a la derecha
        //los elementos < al pivote van a la izquierda
        //variables auxiliares
        int i = izq;
        int j = der;
        int swap;
        //se evaluan los elementos para ubicr el nuevo pivote
        while (i<j) { 
            //mientras que a[i] sea menor al pivote se aumenta i
            //cuando no se cumpla el while el elemento es mayor al pivote
            //y debera ir a la der
            while (a[i] <=pivote && i<j) { 
                i++;
            }
            /*mientras que a[j] sea mayor al pivote se disminuye cuando no se
             cumpla el while el elemento es menor al pivote y debera ir a la izq
             */
            while (a[j]>pivote) { 
                j--;
            }
            /*siempre y cuando i sea menor a j se hace un intercambio de elementos */
            if (i<j) {
                swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }
        }
        a[izq]=a[j];
        a[j]=pivote;
        if (izq<j - 1) {
            quicksort(a, izq, j-1);
        }
        if (j + 1 <der) {
            quicksort(a, j + 1, der);
        }
    }

    //ordeanr tipo double
    public void quicksortDouble(double[] a, int izq,int der){
        //pivote
        double pivote = a[izq];
        //los elementos >al pivote van a la derecha
        //los elementos < al pivote van a la izquierda
        //variables auxiliares
        int i = izq;
        int j = der;
        double swap;
        //se evaluan los elementos para ubicr el nuevo pivote
        while (i<j) { 
            //mientras que a[i] sea menor al pivote se aumenta i
            //cuando no se cumpla el while el elemento es mayor al pivote
            //y debera ir a la der
            while (a[i] <=pivote && i<j) { 
                i++;
            }
            /*mientras que a[j] sea mayor al pivote se disminuye cuando no se
             cumpla el while el elemento es menor al pivote y debera ir a la izq
             */
            while (a[j]>pivote) { 
                j--;
            }
            /*siempre y cuando i sea menor a j se hace un intercambio de elementos */
            if (i<j) {
                swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }
        }
        a[izq]=a[j];
        a[j]=pivote;
        if (izq<j - 1) {
            quicksortDouble(a, izq, j-1);
        }
        if (j + 1 <der) {
            quicksortDouble(a, j + 1, der);
        }
    }

     //ordeanr tipo char
     public void quicksortChar(char[] a, int izq,int der){
        //pivote
        char pivote = a[izq];
        //los elementos >al pivote van a la derecha
        //los elementos < al pivote van a la izquierda
        //variables auxiliares
        int i = izq;
        int j = der;
        char swap;
        //se evaluan los elementos para ubicr el nuevo pivote
        while (i<j) { 
            //mientras que a[i] sea menor al pivote se aumenta i
            //cuando no se cumpla el while el elemento es mayor al pivote
            //y debera ir a la der
            while (a[i] <=pivote && i<j) { 
                i++;
            }
            /*mientras que a[j] sea mayor al pivote se disminuye cuando no se
             cumpla el while el elemento es menor al pivote y debera ir a la izq
             */
            while (a[j]>pivote) { 
                j--;
            }
            /*siempre y cuando i sea menor a j se hace un intercambio de elementos */
            if (i<j) {
                swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }
        }
        a[izq]=a[j];
        a[j]=pivote;
        if (izq<j - 1) {
            quicksortChar(a, izq, j-1);
        }
        if (j + 1 <der) {
            quicksortChar(a, j + 1, der);
        }
    }

    //imprimir enteros
    public void imprimirArreglo(int[] a){
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }

    //imprimir tipo char
    public void imprimirArregloChar(char[] a){
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }

    //imprimir tipo double
    public void imprimirArregloDouble(double[] a){
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }

    //ordenar enteros
    public void shellSort(int[] a){
        int gap, i, j, k, aux;
        gap=a.length/2;
        while (gap>0) { 
            for (i=gap;i<a.length;i++) {
                j=i-gap;
                while (j>=0) { 
                    k=j+gap;
                    if (a[j]<=a[k]) {
                        break;
                    }else{
                        aux = a[j];
                        a[j]=a[k];
                        a[k]=aux;
                        j-=gap;
                    }
                }
            }
            gap/=2;
        }
    }

    //ordenar tipo char
    public void shellSortChar(char[] a){
        int gap, i, j, k;
        char aux;
        gap=a.length/2;
        while (gap>0) { 
            for (i=gap;i<a.length;i++) {
                j=i-gap;
                while (j>=0) { 
                    k=j+gap;
                    if (a[j]<=a[k]) {
                        break;
                    }else{
                        aux = a[j];
                        a[j]=a[k];
                        a[k]=aux;
                        j-=gap;
                    }
                }
            }
            gap/=2;
        }
    }

    //ordenar tipo double
    public void shellSortDouble(double[] a){
        int gap, i, j, k; 
        double aux;
        gap=a.length/2;
        while (gap>0) { 
            for (i=gap;i<a.length;i++) {
                j=i-gap;
                while (j>=0) { 
                    k=j+gap;
                    if (a[j]<=a[k]) {
                        break;
                    }else{
                        aux = a[j];
                        a[j]=a[k];
                        a[k]=aux;
                        j-=gap;
                    }
                }
            }
            gap/=2;
        }
    }

    //ordenar enteros
    public void insercion(int[] a){
        for (int i=1;i<a.length;i++) {
            for (int j=i; j>0 && a[j] < a[j-1]   ; j--) {
                int aux = a[j-1];
                a[j-1]=a[j];
                a[j]=aux;
            }
        }

    }

    //ordenar tipo char
    public void insercionChar(char[] a){
        for (int i=1;i<a.length;i++) {
            for (int j=i; j>0 && a[j] < a[j-1]   ; j--) {
                char aux = a[j-1];
                a[j-1]=a[j];
                a[j]=aux;
            }
        }

    }

    //ordenar tipo double
    public void insercionDouble(double[] a){
        for (int i=1;i<a.length;i++) {
            for (int j=i; j>0 && a[j] < a[j-1]   ; j--) {
                double aux = a[j-1];
                a[j-1]=a[j];
                a[j]=aux;
            }
        }

    }

    //ingresar valores aleatorios a un arreglo
    public int[] valoresAleatorio(int size){
        int[] array = new int[size]; // Crear array con la longitud indicada
        Random random = new Random(); // Objeto Random para generar números aleatorios

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        return array; // Retorna el array cargado con números aleatorios
    }
    
    
}