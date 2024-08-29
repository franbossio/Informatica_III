public class Quicksort {
    public static void main(String[] args) {
        int[] a = {10,5,12,9,3,6,8,2};
        ordenar(a, 0, a.length-1);
        imprimirArreglo(a);
       
    }

    public static void ordenar(int[] a, int izq,int der){
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
                /*imprimimos el nuevo arreglo despues del intercambio */
                imprimirArreglo(a);
            }
        }
        a[izq]=a[j];
        a[j]=pivote;
        if (izq<j - 1) {
            ordenar(a, izq, j-1);
        }
        if (j + 1 <der) {
            ordenar(a, j + 1, der);
        }
    }

    public static void imprimirArreglo(int[] a){
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }

}
