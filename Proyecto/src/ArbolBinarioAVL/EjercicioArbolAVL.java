package ArbolBinarioAVL;
import java.util.*;
public class EjercicioArbolAVL {
    Scanner consola = new Scanner(System.in);
    ArbolAVL arbolAVL = new ArbolAVL();
    int op;
    public void ejecutar(){
        do{
            System.out.println("--------ArbolAVL--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println("1-Generar un árbol binario AVL con la siguiente secuencia de valores: 10, 100, 20, 80, 40, 70");
            System.out.println("2-Generar un árbol binario AVL con la siguiente secuencia ordenada de: 5, 10, 20, 30, 40, 50, 60");
            System.out.println("3-Del árbol siguiente, eliminar el 1. Repetir el ejercicio eliminando el 30");
            System.out.println("4-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste el 1° ejercicio----------");
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("----------Elegiste el 2° ejercicio----------");
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("----------Elegiste el 3° ejercicio----------");
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=4);
    }

    private void ejercicio1(){
        System.out.println("Ingrese la cantidad de elementos que desea insertar en el árbol AVL:");
        int cantidad = consola.nextInt();
        consola.nextLine();

        System.out.println("Ingrese los elementos del árbol AVL:");
        for (int i = 0; i < cantidad; i++) {
            int elemento = consola.nextInt();
            consola.nextLine();
            arbolAVL.insertar(elemento);
        }
        
        System.out.println("Arbol AVL en orden:");
        arbolAVL.imprimirArbol();
    }

    private void ejercicio2(){
        System.out.println("Ingrese la cantidad de elementos que desea insertar en el árbol AVL:");
        int cantidad = consola.nextInt();
        consola.nextLine();

        System.out.println("Ingrese los elementos del árbol AVL:");
        for (int i = 0; i < cantidad; i++) {
            int elemento = consola.nextInt();
            consola.nextLine();
            arbolAVL.insertar(elemento);
        }
        
        System.out.println("Arbol AVL en orden:");
        arbolAVL.imprimirArbol();
    }

    private void ejercicio3(){
        arbolAVL.insertar(4);
        arbolAVL.insertar(2);
        arbolAVL.insertar(30);
        arbolAVL.insertar(1);
        arbolAVL.insertar(10);
        arbolAVL.insertar(50);
        arbolAVL.insertar(5);
        arbolAVL.insertar(20);
        arbolAVL.insertar(40);
        arbolAVL.insertar(60);

        System.out.println("Árbol AVL después de insertar todos los nodos:");
        arbolAVL.imprimirArbol();

        // Eliminar el nodo 1
        arbolAVL.eliminar(1);
        System.out.println("Árbol AVL después de eliminar el nodo 1:");
        arbolAVL.imprimirArbol();

        // Eliminar el nodo 30
        arbolAVL.eliminar(30);
        System.out.println("Árbol AVL después de eliminar el nodo 30:");
        arbolAVL.imprimirArbol();
    }
    
}