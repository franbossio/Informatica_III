public class RepasoParcial_7 {
    public static void main(String[] args) {
        int [] a={1,2,4,8,10,5,3,7};
        System.out.println(sumar(a, 5, 0));
    }

    static int sumar(int [] a,int p, int index ){
        if(index==a.length){
            return 0;
        }else{
            if(a[index]>p){
                return a[index]+sumar(a, p, index + 1);
            }
            return sumar(a, p, index + 1);
        }
    }
}
