package Ordenamiento;

import java.util.Scanner;

public class EjercicioOrdenamiento {

    Ordenamientos<Integer> ordenamientosDeEnteros = new Ordenamientos<>();
    Ordenamientos<Character> ordenamientosDeCaracteres = new Ordenamientos<>();
    Ordenamientos<Double> ordenamientosDeDouble = new Ordenamientos<>();
    Scanner consola = new Scanner(System.in);

    public void ejercutar() {

        int op;
        do {
            System.out.println("--------Ordenamientos--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println(
                    "1-Ordenar por insercion, shellsort y quicksort una array de enteros, tipo double y tipo char");
            System.out.println("2-Implementar una funcion que reciba un array");
            System.out.println(
                    "3-Implementar una funcion que reciba la longitud del arreglo y lo cargue con numeros aleatorios");
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
        } while (op != 5);

    }

    private void ejercicio1() {
        Integer[] a = { 5, 10, 1, 20, 3 };
        Character[] b = { 'a', 't', 'b', 'v', 'c' };
        Double[] c = { 5.52, 10.215, 1.235, 20.987, 3.3256 };
        System.out.println("Arreglos antes de ordenar:");
        ordenamientosDeEnteros.imprimirArreglo(a);
        ordenamientosDeDouble.imprimirArreglo(c);
        ordenamientosDeCaracteres.imprimirArreglo(b);
        System.out.println("Despues de ordenar: ");
        System.out.println("Metodo de insercion: ");
        ordenamientosDeCaracteres.insercion(b);
        ordenamientosDeDouble.insercion(c);
        ordenamientosDeEnteros.insercion(a);
        ordenamientosDeEnteros.imprimirArreglo(a);
        ordenamientosDeDouble.imprimirArreglo(c);
        ordenamientosDeCaracteres.imprimirArreglo(b);
        System.out.println("Metodo de shellsort: ");
        ordenamientosDeEnteros.shellSort(a);
        ordenamientosDeCaracteres.shellSort(b);
        ordenamientosDeDouble.shellSort(c);
        ordenamientosDeEnteros.imprimirArreglo(a);
        ordenamientosDeDouble.imprimirArreglo(c);
        ordenamientosDeCaracteres.imprimirArreglo(b);
        System.out.println("Metodo de quicksort: ");
        ordenamientosDeEnteros.quicksort(a, 0, a.length - 1);
        ordenamientosDeCaracteres.quicksort(b, 0, b.length - 1);
        ordenamientosDeDouble.quicksort(c, 0, c.length - 1);
        ordenamientosDeEnteros.imprimirArreglo(a);
        ordenamientosDeDouble.imprimirArreglo(c);
        ordenamientosDeCaracteres.imprimirArreglo(b);
    }

    private void ejercicio2() {
        Integer[] array = new Integer[5];
        System.out.println("Ingresa 5 numeros para tu arreglo:");
        for (int i = 0; i < 5; i++) {
            array[i] = consola.nextInt();
        }
        System.out.println("Su arreglo es: ");
        ordenamientosDeEnteros.imprimirArreglo(array);
    }

    private void ejercicio3() {
        System.out.println("Seleccione el tamaño del arreglo:");
        int size = consola.nextInt();
        Integer[] v = ordenamientosDeEnteros.valoresAleatorio(size);
        System.out.println("El arreglo es:\n");
        ordenamientosDeEnteros.imprimirArreglo(v);
    }

    private void ejercicio4() {
        Integer[] a1 = ordenamientosDeEnteros.valoresAleatorio(100);
        Integer[] a2 = ordenamientosDeEnteros.valoresAleatorio(1000);
        Integer[] a3 = ordenamientosDeEnteros.valoresAleatorio(10000);
        long inicioQuick = System.nanoTime();
        ordenamientosDeEnteros.quicksort(a1, 0, a1.length - 1);
        long finoQuick = System.nanoTime();
        long inicioShell = System.nanoTime();
        ordenamientosDeEnteros.shellSort(a1);
        long finoShell = System.nanoTime();
        long inicioInsercion = System.nanoTime();
        ordenamientosDeEnteros.insercion(a1);
        long finoInsercion = System.nanoTime();
        long inicioQuick1 = System.nanoTime();
        ordenamientosDeEnteros.quicksort(a2, 0, a2.length - 1);
        long finoQuick1 = System.nanoTime();
        long inicioShell1 = System.nanoTime();
        ordenamientosDeEnteros.shellSort(a2);
        long finoShell1 = System.nanoTime();
        long inicioInsercion1 = System.nanoTime();
        ordenamientosDeEnteros.insercion(a2);
        long finoInsercion1 = System.nanoTime();
        long inicioQuick2 = System.nanoTime();
        ordenamientosDeEnteros.quicksort(a3, 0, a3.length - 1);
        long finoQuick2 = System.nanoTime();
        long inicioShell2 = System.nanoTime();
        ordenamientosDeEnteros.shellSort(a3);
        long finoShell2 = System.nanoTime();
        long inicioInsercion2 = System.nanoTime();
        ordenamientosDeEnteros.insercion(a3);
        long finoInsercion2 = System.nanoTime();
        System.out.println("100 elementos: ");
        System.out.println("Quicksort: " + (finoQuick - inicioQuick) + " nano segundos");
        System.out.println("Shellsort: " + (finoShell - inicioShell) + " nano segundos");
        System.out.println("Insercion: " + (finoInsercion - inicioInsercion) + " nano segundos");
        System.out.println("1000 elementos: ");
        System.out.println("Quicksort: " + (finoQuick1 - inicioQuick1) + " nano segundos");
        System.out.println("Shellsort: " + (finoShell1 - inicioShell1) + " nano segundos");
        System.out.println("Insercion: " + (finoInsercion1 - inicioInsercion1) + " nano segundos");
        System.out.println("10000 elementos: ");
        System.out.println("Quicksort: " + (finoQuick2 - inicioQuick2) + " nano segundos");
        System.out.println("Shellsort: " + (finoShell2 - inicioShell2) + " nano segundos");
        System.out.println("Insercion: " + (finoInsercion2 - inicioInsercion2) + " nano segundos");
    }

}
