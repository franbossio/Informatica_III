import java.util.Scanner;

import ArbolBinario.EjercicioArbolBinario;
import ArbolBinarioAVL.EjercicioArbolAVL;
import General.EjercicioGeneral;
import MonticuloBinario.EjercicioMonticuloBinario;
import Ordenamiento.EjercicioOrdenamiento;
import PilasColas.EjercicioPilasColas;
import PilasColasconListas.EjercicioPilasColasconLista;
import Recursividad.EjercicioRecursividad;

public class Main {
    public static void main(String[] args) {
        EjercicioRecursividad ejercicioRecursividad = new EjercicioRecursividad();
        EjercicioOrdenamiento ejercicioOrdenamiento = new EjercicioOrdenamiento();
        EjercicioPilasColasconLista ejercicioPilasColasconLista = new EjercicioPilasColasconLista();
        EjercicioMonticuloBinario ejercicioMonticuloBinario = new EjercicioMonticuloBinario();
        EjercicioPilasColas ejercicioPilasColas = new EjercicioPilasColas();
        EjercicioArbolBinario ejercicioArbolBinario = new EjercicioArbolBinario();
        EjercicioArbolAVL ejercicioArbolAVL = new EjercicioArbolAVL();
        EjercicioGeneral ejercicioGeneral = new EjercicioGeneral();
        
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
            System.out.println("10-General con librerías nativas de Java");
            System.out.println("11-Salir");
            op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    ejercicioRecursividad.ejecutar();
                    break;
                case 2:
                    ejercicioOrdenamiento.ejercutar();
                    break;
                case 3:
                    ejercicioPilasColas.ejecutar();
                    break;
                case 4:
                    ejercicioPilasColasconLista.ejecutar();
                    break;
                case 5:
                    ejercicioArbolBinario.ejecutar();
                    break;
                case 6:
                    ejercicioArbolAVL.ejecutar();
                    break;
                case 7:
                    break;
                case 8:
                    ejercicioMonticuloBinario.ejecutar();
                    break;
                case 9:
                    break;
                case 10: 
                    ejercicioGeneral.ejecutar();
                    break;
                case 11:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=11);
        
    }
}
