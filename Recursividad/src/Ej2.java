import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero:");
        int x=new Scanner(System.in).nextInt();
        System.out.println("suma("+x+") es: "+suma(x));
    }
    public static int suma(int x){
        if (x==1) {
            return 1;
        }
        return x+suma(x-1);

    }
}
