package Recursividad;

import java.util.Scanner;

public class EjercicioRecursividad {

    public void ejecutar() {
        Recursividad r = new Recursividad();
        Scanner consola = new Scanner(System.in);
        int x, y, op;
        do {
            System.out.println("--------Recursividad--------");
            System.out.println("Elegir la funcion recursiva: ");
            System.out.println("1-Factorial");
            System.out.println("2-Suma");
            System.out.println("3-Potencia");
            System.out.println("4-Conteo regresivo");
            System.out.println("5-Producto de dos numeros");
            System.out.println("6-Mostrar arreglo en orden inverso");
            System.out.println("7-Binario(contar unos)");
            System.out.println("8-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("--------Seleccionaste Factorial--------");
                    System.out.println("Ingrese un numero:");
                    x = consola.nextInt();
                    System.out.println("El factorial de " + x + " es: " + r.factorial(x));
                    break;
                case 2:
                    System.out.println("--------Seleccionaste Suma--------");
                    System.out.println("Ingrese un numero:");
                    x = consola.nextInt();
                    System.out.println("La suma es: " + r.suma(x));
                    break;
                case 3:
                    System.out.println("--------Seleccionaste Potencia--------");
                    System.out.println("Ingrese el numero base:");
                    x = consola.nextInt();
                    System.out.println("Ingrese el exponente:");
                    y = consola.nextInt();
                    System.out.println(x + "^" + y + "=" + r.potencia(x, y));
                    break;
                case 4:
                    System.out.println("--------Seleccionaste Conteo regresivo--------");
                    System.out.println("Ingrese un numero:");
                    x = consola.nextInt();
                    System.out.println(r.conteo(x));
                    break;
                case 5:
                    System.out.println("--------Seleccionaste Producto de dos numeros--------");
                    System.out.println("Ingrese el primer numero:");
                    x = consola.nextInt();
                    System.out.println("Ingrese el segundo numero:");
                    y = consola.nextInt();
                    System.out.println(x + "x" + y + "=" + r.producto(x, y));
                    break;
                case 6:
                    System.out.println("--------Seleccionaste Mostrar arreglo en orden inverso--------");
                    int[] a = { 10, 20, 30, 40, 50 };
                    System.out.println("Arreglo orininal:");
                    for (int i : a) {
                        System.out.println(i);
                    }
                    System.out.println("Arreglo inverso");
                    r.imprimirInverso(a, 0);
                    break;
                case 7:
                    System.out.println("--------Seleccionaste Binario(contar unos)--------");
                    System.out.println("Ingrese un numero:");
                    x = consola.nextInt();
                    System.out.println("La cantidad de unos en codigo binario son: " + r.contarUnos(x));
                    break;
                case 8:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 8);
        consola.close();
    }
}
