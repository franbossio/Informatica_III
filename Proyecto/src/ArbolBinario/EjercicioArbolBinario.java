package ArbolBinario;

import java.util.Scanner;

public class EjercicioArbolBinario {
    int op;
    Scanner consola = new Scanner(System.in);
    public void ejecutar(){
        ArbolBinario arbol = new ArbolBinario();
        do {
            System.out.println("----------Arbol Binario----------");
            System.out.println("Elige una opcion:");
            System.out.println("1-Agregar Nodo");
            System.out.println("2-Recorrido InOrden");
            System.out.println("3-Recorrido PreOrden");
            System.out.println("4-Recorrido PostOrden");
            System.out.println("5-Dtree");
            System.out.println("6-Buscar Nodo raiz");
            System.out.println("7-Calcular profundidad");
            System.out.println("8-Imprimir arbol");
            System.out.println("9-Salir");
            System.out.println("Ingrese opcion: ");
            op = consola.nextInt();
            consola.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese un valor entero para agregar al arbol: ");
                    int nuevoNodo = consola.nextInt();
                    consola.nextLine();
                    arbol.agregar(nuevoNodo);
                    break;
                case 2:
                    System.out.println("inOrdenRecursivo");
                    arbol.InOrden();
                    break;
                case 3:
                    System.out.println("preOrdenRecursivo");
                    arbol.PreOrden();
                    break;
                case 4:
                    System.out.println("PostOrdenRecursivo:");
                    arbol.PostOrden();
                    break;
                case 5:
                    System.out.println("Ingresa valor del nodo a eliminar:");
                    int target = consola.nextInt();
                    consola.nextLine();
                    arbol.buscar(target);
                    break;
                case 6:
                    System.out.println("El valor de la raiz del arbol es: " + arbol.raiz.valor);
                    break;
                case 7:
                    int depth = arbol.depth();
                    System.out.println("El arbol posee " + depth + " niveles");
                case 8:
                System.out.println("Arbol Binario: ");
                    arbol.impArbol();
                    break;
                case 9:
                    System.out.println("Adios");
                    break;
            }
            
        } while (op!=9);
    }

    
}
