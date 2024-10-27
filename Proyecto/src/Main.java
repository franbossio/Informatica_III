import java.util.Scanner;

import Ordenamiento.EjercicioOrdenamiento;
import Recursividad.EjercicioRecursividad;

public class Main {
    public static void main(String[] args) {
        EjercicioRecursividad ejercicioRecursividad = new EjercicioRecursividad();
        EjercicioOrdenamiento ejercicioOrdenamiento = new EjercicioOrdenamiento();
        int op;
        do{
            System.out.println("--------Menu Principal--------");
            System.out.println("Seleccionar el tema:");
            System.out.println("1-Recursividad");
            System.out.println("2-Ordenamientos");
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
                case 2:
                    ejercicioOrdenamiento.ejercutar();
                    break;
                case 7:
                    System.out.println("Adios");
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=7);
        
    }
}
