public class Inserccion {
    public static void main(String[] args) {
        int[] a = {10,5,12,9,3,6,8,2};
        ordenar(a);

        for (int elem : a) {
            System.out.print(elem+ " ");
        }
    }
    public static void ordenar(int[] a){
        for (int i=1;i<a.length;i++) {
            for (int j=i; j>0 && a[j] < a[j-1]   ; j--) {
                int aux = a[j-1];
                a[j-1]=a[j];
                a[j]=aux;
            }
        }

    }
}
