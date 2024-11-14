package General;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList2 {

    public void ejecutarLinkedList() {
        LinkedList<Objeto> listaBarrios = new LinkedList<>();
        Scanner entradaUsuario = new Scanner(System.in);

        // Solicitar la cantidad de elementos al usuario
        System.out.print("Especifique cuántos barrios desea añadir: ");
        int totalElementos = entradaUsuario.nextInt();
        entradaUsuario.nextLine(); // Limpieza del salto de línea

        // Paso 1: Añadir los objetos proporcionados por el usuario
        for (int i = 0; i < totalElementos; i++) {
            System.out.print("Introduzca el nombre del barrio: ");
            String nombreBarrio = entradaUsuario.nextLine();
            System.out.print("Introduzca el número de dirección: ");
            int numeroDireccion = entradaUsuario.nextInt();
            entradaUsuario.nextLine(); // Limpieza del salto de línea
            listaBarrios.add(new Objeto(nombreBarrio, numeroDireccion));
        }

        // Paso 2: Imprimir toda la LinkedList
        System.out.println("Lista completa de barrios: " + listaBarrios);

        // Paso 3: Imprimir un elemento específico si existe
        System.out.print("Ingrese el índice del barrio que desea visualizar: ");
        int indiceVisualizar = entradaUsuario.nextInt();
        if (!listaBarrios.isEmpty() && indiceVisualizar >= 0 && indiceVisualizar < listaBarrios.size()) {
            System.out.println("Barrio en el índice especificado: " + listaBarrios.get(indiceVisualizar));
        } else {
            System.out.println("Índice fuera de rango o lista vacía.");
        }

        // Paso 4: Borrar un elemento en el índice 2 si existen suficientes elementos
        if (listaBarrios.size() >= 3) {
            System.out.print("Ingrese el índice del barrio a eliminar: ");
            int indiceEliminar = entradaUsuario.nextInt();
            listaBarrios.remove(indiceEliminar);
            System.out
                    .println("Lista de barrios tras eliminación en el índice " + indiceEliminar + ": " + listaBarrios);
        } else {
            System.out.println("No hay suficientes barrios para eliminar en el índice 2.");
        }

    }
}
