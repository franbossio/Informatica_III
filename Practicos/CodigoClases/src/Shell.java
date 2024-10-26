public class Shell {
    public static void main(String[] args) {
        int[] a = {10,5,12,9,3,6,8,2};
        ordenar(a);

        for (int elem : a) {
            System.out.print(elem+ " ");
        }
    }
    public static void ordenar(int[] a){
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
}
