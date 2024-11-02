package ArbolBinarioAVL;

import java.util.Scanner;

public class EjercicioArbolAVL {
    Scanner consola = new Scanner(System.in);
    ArbolAVL arbolAVL = new ArbolAVL();
    int op;
    public void ejecutar(){
        do{
            System.out.println("--------Arbol AVL--------");
            System.out.println("Seleccionar el ejercicio:");
            System.out.println("1-Crear la clase ArbolAVL con los métodos de inserción y eliminación de nodos");
            System.out.println("2-Generar un árbol binario AVL con la siguiente secuencia de valores: 10, 100, 20, 80, 40, 70");
            System.out.println("3-Generar un árbol binario AVL con la siguiente secuencia ordenada de valores: 5, 10, 20, 30, 40, 50, 60");
            System.out.println("4-");
            System.out.println("5-Escribir un método que implemente la rotación doble");
            System.out.println("6-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste el 1° ejercicio----------");
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("----------Elegiste el 2° ejercicio----------");
                    
                    break;
                case 3:
                    System.out.println("----------Elegiste el 3° ejercicio----------");
                    break;
                case 4:
                    System.out.println("----------Elegiste el 4° ejercicio----------");
                    
                    break;
                case 5:
                    System.out.println("----------Elegiste el 5° ejercicio----------");
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }
        }while(op!=6);
    }

    private void ejercicio1(){
        do {
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Insertar un elemento");
            System.out.println("2-Eliminar un elemento");
            System.out.println("3-Salir");
            op=consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa un elemento para agregar:");
                    int x=consola.nextInt();
                    arbolAVL.insertar(x);
                    break;
                case 2:
                    System.out.println("Ingresa el elemento que quieres eliminar:");
                    int n=consola.nextInt();
                    arbolAVL.eliminar(n);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
            }
        } while (op!=3);
    }

    private void ejercicio2(){

    }
}
