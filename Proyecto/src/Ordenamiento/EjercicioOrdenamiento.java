package Ordenamiento;

import java.util.Scanner;

public class EjercicioOrdenamiento {

    Ordenamientos o = new Ordenamientos();
    Scanner consola = new Scanner(System.in);

    public void ejercutar(){
        
        int op;
        do{
            System.out.println("--------Ordenamientos--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println("1-Ordenar por insercion, shellsort y quicksort una array de enteros, tipo double y tipo char");
            System.out.println("2-Implementar una funcion que reciba un array");
            System.out.println("3-Implementar una funcion que reciba la longitud del arreglo y lo cargue con numeros aleatorios");
            System.out.println("4-Capturar el tiempo de ordenamiento");
            System.out.println("5-Salir");
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
                    System.out.println("----------Elegiste el 4° ejercicio----------");
                    ejercicio4();
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
    
    private void ejercicio1(){
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
    }

    private void ejercicio2(){
        int[] array = new int[5];
        System.out.println("Ingresa 5 numeros para tu arreglo:");
        for(int i=0;i<5;i++){
            array[i]=consola.nextInt();
        }
        System.out.println("Su arreglo es: ");
        o.imprimirArreglo(array);
    }

    private void ejercicio3(){
        System.out.println("Seleccione el tamaño del arreglo:");
        int size=consola.nextInt();
        int[] v=o.valoresAleatorio(size);
        System.out.println("El arreglo es:\n");
        o.imprimirArreglo(v);
    }

    private void ejercicio4(){
        int[] a1=o.valoresAleatorio(100);
        int[] a2=o.valoresAleatorio(1000);
        int[] a3=o.valoresAleatorio(10000);
        long inicioQuick = System.nanoTime();
        o.quicksort(a1, 0, a1.length-1);
        long finoQuick = System.nanoTime();
        long inicioShell = System.nanoTime();
        o.shellSort(a1);
        long finoShell = System.nanoTime();
        long inicioInsercion = System.nanoTime();
        o.insercion(a1);
        long finoInsercion = System.nanoTime();
        long inicioQuick1 = System.nanoTime();
        o.quicksort(a2, 0, a2.length-1);
        long finoQuick1 = System.nanoTime();
        long inicioShell1 = System.nanoTime();
        o.shellSort(a2);
        long finoShell1 = System.nanoTime();
        long inicioInsercion1 = System.nanoTime();
        o.insercion(a2);
        long finoInsercion1 = System.nanoTime();
        long inicioQuick2 = System.nanoTime();
        o.quicksort(a3, 0, a3.length-1);
        long finoQuick2 = System.nanoTime();
        long inicioShell2 = System.nanoTime();
        o.shellSort(a3);
        long finoShell2 = System.nanoTime();
        long inicioInsercion2 = System.nanoTime();
        o.insercion(a3);
        long finoInsercion2 = System.nanoTime();
        System.out.println("100 elementos: ");
        System.out.println("Quicksort: "+(finoQuick-inicioQuick)+" nano segundos");
        System.out.println("Shellsort: "+(finoShell-inicioShell)+" nano segundos");
        System.out.println("Insercion: "+(finoInsercion-inicioInsercion)+" nano segundos");
        System.out.println("1000 elementos: ");
        System.out.println("Quicksort: "+(finoQuick1-inicioQuick1)+" nano segundos");
        System.out.println("Shellsort: "+(finoShell1-inicioShell1)+" nano segundos");
        System.out.println("Insercion: "+(finoInsercion1-inicioInsercion1)+" nano segundos");
        System.out.println("10000 elementos: ");
        System.out.println("Quicksort: "+(finoQuick2-inicioQuick2)+" nano segundos");
        System.out.println("Shellsort: "+(finoShell2-inicioShell2)+" nano segundos");
        System.out.println("Insercion: "+(finoInsercion2-inicioInsercion2)+" nano segundos");
    }

}
