public class RepasoParcial_3 {
    public static void main(String[] args) {
         System.out.println(cantidad(5));
    }

    static String cantidad(int n){
        if(n==0){
            return " ";
        }else{
            return "*" + cantidad(n-1);
        }
    }
}
