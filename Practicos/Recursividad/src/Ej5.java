import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        int a= consola.nextInt();
        System.out.println("Ingresa el segundo numero:");
        int b = consola.nextInt(); 
        System.out.println("potencia("+a+","+b+") es: "+potencia(a,b));
    }
    public static int potencia(int a,int b){
        if (b==0) {
            return 1;
        }
        return a*potencia(a, b-1);
    }
}
