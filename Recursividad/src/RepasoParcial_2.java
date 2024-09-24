public class RepasoParcial_2 {
    public static void main(String[] args) {
        impar(10);
    }
    static void impar(int n){
        if(n==1){
            System.out.println(n);
        }else{
            if(n%2!=0){
                System.out.println(n);
            }
            impar(n-1);
        }
    }
}
