package General;

import java.util.*;

public class ArrayList1 {
    public void ejecutarArrayList() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Object> listaObjetos = new ArrayList<>();

        System.out.println("Indique el número de elementos a añadir:");
        int numObjetos = entrada.nextInt();
        entrada.nextLine(); // Limpieza del salto de línea

        // Entrada de datos del usuario
        for (int i = 0; i < numObjetos; i++) {
            System.out.println("Introduce el nombre del elemento " + (i + 1) + ": ");
            String nombreElemento = entrada.nextLine();

            System.out.println("Introduce el valor del elemento " + (i + 1) + ": ");
            int valorElemento = entrada.nextInt();
            entrada.nextLine(); // Limpieza del salto de línea

            listaObjetos.add(new Objeto(nombreElemento, valorElemento));
        }

        // Mostrar todos los elementos en la lista
        System.out.println("Lista de elementos: " + listaObjetos);

        // Visualizar un elemento en un índice específico
        System.out.println("Indica el índice del elemento a visualizar:");
        int indiceElemento = entrada.nextInt();
        System.out.println("El elemento en ese índice es: " + listaObjetos.get(indiceElemento));

        // Eliminar un elemento en el índice especificado
        System.out.println("Indica el índice del elemento que quieres eliminar:");
        int indiceEliminar = entrada.nextInt();
        listaObjetos.remove(indiceEliminar);
        System.out.println("Lista después de la eliminación: " + listaObjetos);

        // Mostrar la lista actualizada
        System.out.println("Lista final: " + listaObjetos);
    }
}
