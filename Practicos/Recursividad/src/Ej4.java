import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Ingresa una palabra:");
        String cadena=new Scanner(System.in).nextLine();
        System.out.println("invertir("+cadena+") es: "+invertir(cadena));
    }
    public static String invertir(String cadena){
        if (cadena.isEmpty()) {
            return cadena;
        }
        return invertir(cadena.substring(1))+cadena.charAt(0);


    }
}
