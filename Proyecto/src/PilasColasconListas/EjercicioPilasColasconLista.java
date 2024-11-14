package PilasColasconListas;

import java.util.*;

public class EjercicioPilasColasconLista {

    Pila<Integer> pilaEntero = new Pila<>();
    Pila<String> pilaString = new Pila<>();
    Cola<Integer> colaEntero = new Cola<>();

    Scanner consola = new Scanner(System.in);
    int op, x, op2;

    public void ejecutar() {
        do {
            System.out.println("--------Pilas y colas con listas--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println("1-Implementación de una Pila con lista");
            System.out.println(
                    "2-Implementa una pila que almacene palabras. Luego, desapílalas e imprímelas en orden inverso");
            System.out.println("3-Verificacion de parentesis con pilas");
            System.out.println("4-Convertir decimal a binario");
            System.out.println("5-Implementación de una Cola con lista");
            System.out.println(
                    "6-Implementa una cola que almacene números enteros. Luego, desencola y suma todos los números");
            System.out.println("7-Ordenamiento de Cola");
            System.out.println("8-Verificación de Palíndromos con cola");
            System.out.println("9-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste el 1° ejercicio----------");
                    pilaEntero.makeEmpty();
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("----------Elegiste el 2° ejercicio----------");
                    pilaString.makeEmpty();
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("----------Elegiste el 3° ejercicio----------");
                    pilaString.makeEmpty();
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("----------Elegiste el 4° ejercicio----------");
                    pilaEntero.makeEmpty();
                    ejercicio4();
                    break;
                case 5:
                    System.out.println("----------Elegiste el 5° ejercicio----------");
                    colaEntero.makeEmpty();
                    ejercicio5();
                    break;
                case 6:
                    System.out.println("----------Elegiste el 6° ejercicio----------");
                    ejercicio6();
                    break;
                case 7:
                    System.out.println("----------Elegiste el 7° ejercicio----------");
                    colaEntero.makeEmpty();
                    ejercicio7();
                    break;
                case 8:
                    System.out.println("----------Elegiste el 8° ejercicio----------");
                    ejercicio8();
                    break;
                case 9:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 9);

    }

    private void ejercicio1() {
        do {
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Agregar elementos");
            System.out.println("2-Eliminar elemento");
            System.out.println("3-Mostrar el top");
            System.out.println("4-Mostrar pila");
            System.out.println("5-Salir");
            op2 = consola.nextInt();
            switch (op2) {
                case 1:
                    System.out.println("Ingresa el elemento para agregar:");
                    x = consola.nextInt();
                    pilaEntero.push(x);
                    break;
                case 2:
                    System.out.println("Elemento " + pilaEntero.topAndPop() + "eliminado correctamente");
                    break;
                case 3:
                    System.out.println("El top es: " + pilaEntero.top());
                    break;
                case 4:
                    pilaEntero.mostrarPila();
                    break;
            }
        } while (op2 != 5);

    }

    private void ejercicio2() {
        System.out.println("Ingrese palabras para apilar. Escriba 'fin' para terminar:");
        while (true) {
            String palabra = consola.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            pilaString.push(palabra);
        }

        // Desapilar y mostrar las palabras en orden inverso
        System.out.println("\nPalabras en orden inverso:");
        while (!pilaString.isEmpty()) {
            System.out.println(pilaString.topAndPop()); // Desapilar y mostrar cada palabra
        }
    }

    private void ejercicio3() {
        System.out.println("Ingresa la ecucacion: ");
        consola.nextLine();
        String ecuacion = consola.nextLine();
        for (int i = 0; i < ecuacion.length(); i++) {
            if (ecuacion.charAt(i) == '(') {
                pilaString.push("(");
                ;
            } else if (ecuacion.charAt(i) == ')') {
                pilaString.pop();
            }
        }
        if (pilaString.isEmpty()) {
            System.out.println("Parentesis balanceados");
        } else {
            System.out.println("Parentesis desbalanceados");
        }
    }

    private void ejercicio4() {
        System.out.print("Ingresa un número decimal: ");
        int numeroDecimal = consola.nextInt();

        if (numeroDecimal == 0) {
            System.out.println("El número en binario es: 0");
        } else {
            // Algoritmo de división sucesiva por 2
            while (numeroDecimal > 0) {
                int residuo = numeroDecimal % 2; // Residuo al dividir por 2
                pilaEntero.push(residuo); // Apilamos el residuo
                numeroDecimal /= 2; // Actualizamos el número dividiéndolo por 2
            }

            System.out.print("El número en binario es: ");
            // Desapilamos los elementos para formar el número binario
            while (!pilaEntero.isEmpty()) {
                System.out.print(pilaEntero.topAndPop()); // Mostramos el elemento en la cima y lo removemos
            }
            System.out.println();
        }
    }

    private void ejercicio5() {
        do {
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Agregar elementos");
            System.out.println("2-Eliminar elemento");
            System.out.println("3-Mostrar el frente");
            System.out.println("4-Mostrar cola");
            System.out.println("5-Salir");
            op2 = consola.nextInt();
            switch (op2) {
                case 1:
                    System.out.println("Ingresa el elemento para agregar:");
                    x = consola.nextInt();
                    colaEntero.enqueue(x);
                    break;
                case 2:
                    System.out.println("Numero " + colaEntero.dequeue() + " eliminado");
                    break;
                case 3:
                    System.out.println("El frente es: " + colaEntero.getFront());
                    break;
                case 4:
                    colaEntero.mostrarCola();
                    break;
            }
        } while (op2 != 5);
    }

    private void ejercicio6() {
        System.out.println("Ingresa la cantidad de elementos que deseas agregar a la cola: ");
        int cant = consola.nextInt();
        System.out.println("Ingresa los datos: ");
        for (int i = 0; i < cant; i++) {
            int x = consola.nextInt();
            colaEntero.enqueue(x);
        }
        // Proceso de desencolado y suma
        int sumaTotal = 0;
        System.out.println("\nDesencolando y sumando números...");
        while (!colaEntero.isEmpty()) {
            int numero = colaEntero.dequeue();
            sumaTotal += numero;
            System.out.println("Desencolado: " + numero);
        }

        System.out.println("La suma total de los números es: " + sumaTotal);
    }

    private void ejercicio7() {
        Pila<Integer> pilaAuxiliar = new Pila<>();

        System.out.println("Ingresa la cantidad de elementos que deseas agregar a la cola: ");
        int cant = consola.nextInt();
        System.out.println("Ingresa los datos: ");
        for (int i = 0; i < cant; i++) {
            int x = consola.nextInt();
            colaEntero.enqueue(x);
        }

        while (!colaEntero.isEmpty()) {
            // Extrae el primer elemento de la cola
            int temp = colaEntero.dequeue();

            // Mueve los elementos de la pila a la cola hasta encontrar el lugar adecuado
            // para 'temp'
            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.top() > temp) {
                colaEntero.enqueue(pilaAuxiliar.topAndPop());
            }

            // Inserta el elemento en la pila
            pilaAuxiliar.push(temp);
        }

        // Pasar los elementos ordenados de la pila de nuevo a la cola
        while (!pilaAuxiliar.isEmpty()) {
            colaEntero.enqueue(pilaAuxiliar.topAndPop());
        }

        System.out.println("Cola ordenada: ");
        colaEntero.mostrarCola();
    }

    private void ejercicio8() {
        Cola<Character> colaNormal = new Cola<>();
        Cola<Character> colaInversa = new Cola<>();
        boolean bandera = false;
        System.out.println("Ingresa una palabra o frase:");
        consola.nextLine();
        String palabra = consola.nextLine();
        // Normalizar la frase: convertir a minúsculas, quitar espacios y signos de
        // puntuación
        palabra = palabra.toLowerCase().replaceAll("[^a-z0-9]", "");

        // ingresar cada letra a una cola
        for (int i = 0; i < palabra.length(); i++) {
            colaNormal.enqueue(palabra.charAt(i));
        }

        // ingresar cada letra pero con la palabra inversa
        for (int i = palabra.length() - 1; i >= 0; i--) {
            colaInversa.enqueue(palabra.charAt(i));
        }

        while (!colaNormal.isEmpty()) {
            // Si algún par de caracteres no coincide, no es un palíndromo
            if (!colaNormal.dequeue().equals(colaInversa.dequeue())) {
                bandera = true;
            }
        }

        if (bandera) {
            System.out.println("La palabra o frase no es un palíndromo.");
        } else {
            System.out.println("La palabra o frase es un palíndromo.");
        }

    }
}