import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero:");
        int x=new Scanner(System.in).nextInt();
        System.out.println("fibonacci("+x+") es: "+fibonacci(x));
    }
    public static int fibonacci(int x){
        if(x<=1){
            return x;
        
        }
        return fibonacci(x-1)+fibonacci(x-2);

    }
}
