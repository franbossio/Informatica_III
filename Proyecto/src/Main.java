import java.util.Scanner;
import Recursividad.EjercicioRecursividad;

public class Main {
    public static void main(String[] args) {
        EjercicioRecursividad ejercicioRecursividad = new EjercicioRecursividad();
        int op;
        do{
            System.out.println("--------Menu Principal--------");
            System.out.println("Seleccionar el tema:");
            System.out.println("1-Recursividad");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
            System.out.println("7-Salir");
            op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    ejercicioRecursividad.ejecutar();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=7);
        
    }
}
