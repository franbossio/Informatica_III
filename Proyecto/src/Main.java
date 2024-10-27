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
            System.out.println("3-Pilas y Colas");
            System.out.println("4-Pilas y Colas con listas");
            System.out.println("5-Arbol Binario");
            System.out.println("6-Arbol Binario AVL");
            System.out.println("7-Arbol Rojinegro");
            System.out.println("8-Monticulo Binario");
            System.out.println("9-Tabla Hash");
            System.out.println("10-Salir");
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
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=7);
        
    }
}
