
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero:");
        int x=new Scanner(System.in).nextInt();
        System.out.println("Factorial de "+x+" es: "+factorial(x));
    }
    public static int factorial(int x){
        if (x==0) {
            return 1;
        }else{
            return x*factorial(x-1);
        }

    }
}
