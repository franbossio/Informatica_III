package Ordenamiento;

import java.util.Scanner;

public class EjercicioOrdenamiento {
    public void ejercutar(){
        Ordenamientos o = new Ordenamientos();
        Scanner consola = new Scanner(System.in);
        int x,y,op;
        do{
            System.out.println("--------Ordenamientos--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println("1-");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                System.out.println("----------Elegiste el 1° ejercicio----------");
                    int[] a ={5,10,1,20,3};
                    char[] b ={'a','t','b','v','c'};
                    double[] c ={5.52,10.215,1.235,20.987,3.3256};
                    System.out.println("Arreglos antes de ordenar:");
                    o.imprimirArreglo(a);
                    o.imprimirArregloChar(b);
                    o.imprimirArregloDouble(c);
                    System.out.println("Despues de ordenar: ");
                    System.out.println("Metodo de insercion: ");
                    o.insercion(a);
                    o.insercionChar(b);
                    o.insercionDouble(c);
                    o.imprimirArreglo(a);
                    o.imprimirArregloChar(b);
                    o.imprimirArregloDouble(c);
                    System.out.println("Metodo de shellsort: ");
                    o.shellSort(a);
                    o.shellSortChar(b);
                    o.shellSortDouble(c);
                    o.imprimirArreglo(a);
                    o.imprimirArregloChar(b);
                    o.imprimirArregloDouble(c);
                    System.out.println("Metodo de quicksort: ");
                    o.quicksort(a, 0, a.length-1);
                    o.quicksortChar(b, 0, b.length-1);
                    o.quicksortDouble(c, 0, c.length-1);
                    o.imprimirArreglo(a);
                    o.imprimirArregloChar(b);
                    o.imprimirArregloDouble(c);
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=5);
        
    }
    
}
