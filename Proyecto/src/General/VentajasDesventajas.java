package General;

import java.util.Scanner;

public class VentajasDesventajas {

    public void ejecutar() {
        Scanner consola = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----------Estructuras de datos----------");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. HashMap");
            System.out.println("4. TreeMap");
            System.out.println("5. LinkedHashMap");
            System.out.println("6. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    ArrayList();
                    break;
                case 2:
                    LinkedList();
                    break;
                case 3:
                    HashMap();
                    break;
                case 4:
                    TreeMap();
                    break;
                case 5:
                    LinkedHashMap();
                    break;
                case 6:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }

    private void ArrayList() {
        System.out.println("----------ArrayList----------");
        System.out.println("Ventajas:");
        System.out.println("  - Acceso rápido a elementos por índice (O(1)).\n" + //
                "- Eficiente en consumo de memoria cuando no hay muchas inserciones o eliminaciones.");
        System.out.println("Desventajas:");
        System.out.println(
                "- Operaciones de inserción y eliminación en posiciones intermedias o al inicio son costosas (O(n)).\n"
                        + //
                        "- Tamaño de la lista debe aumentar al alcanzar su capacidad, lo que implica realocación de elementos.");
        System.out.println("Uso recomendado:");
        System.out.println(
                "  - Ideal para listas donde se accede frecuentemente a elementos por su posición y hay pocas modificaciones.");
    }

    private void LinkedList() {
        System.out.println("----------LinkedList----------");
        System.out.println("Ventajas:");
        System.out.println(
                "  - Inserción y eliminación de elementos son rápidas (O(1)), ya que no es necesario reorganizar otros elementos.\n"
                        + //
                        "- No necesita predefinir tamaño y crece dinámicamente.\n" + //
                        "");
        System.out.println("Desventajas:");
        System.out.println(
                "  - Acceso a elementos por índice es más lento (O(n)), ya que requiere recorrer la lista desde el inicio.\n"
                        + //
                        "- Consumo de memoria más alto debido a que cada nodo almacena referencias adicionales.");
        System.out.println("Uso recomendado:");
        System.out.println(
                " - Adecuada para colecciones con inserciones y eliminaciones frecuentes, sin acceso por índice.");
    }

    private void HashMap() {
        System.out.println("----------HashMap----------");
        System.out.println("Ventajas:");
        System.out.println(
                "  - Búsqueda, inserción y eliminación de elementos son rápidas (O(1)) en promedio.\n" + //
                        "- No mantiene orden de los elementos, permitiendo una estructura de datos eficiente.");
        System.out.println("Desventajas:");
        System.out.println(
                "  - No garantiza orden; si necesitas orden de inserción u orden natural, no es la mejor opción.\n" + //
                        "- Colisiones pueden disminuir la eficiencia y requieren estrategias de manejo de colisiones.");
        System.out.println("Uso recomendado:");
        System.out.println(
                "  - Ideal para aplicaciones de mapeo rápido, donde el orden no es necesario y la eficiencia es una prioridad.");
    }

    private void TreeMap() {
        System.out.println("----------TreeMap----------");
        System.out.println("Ventajas:");
        System.out.println(
                "  - Mantiene los elementos ordenados de acuerdo a la clave.\n" + //
                        "- Ideal para búsquedas en intervalos y acceso ordenado.");
        System.out.println("Desventajas:");
        System.out.println(
                "  - Operaciones de inserción, eliminación y búsqueda son más lentas (O(log n)) comparado con HashMap.");
        System.out.println("Uso recomendado:");
        System.out.println(
                "  - Útil cuando se necesita ordenamiento de los elementos por claves.");
    }

    private void LinkedHashMap() {
        System.out.println("----------LinkedHashMap----------");
        System.out.println("Ventajas:");
        System.out.println("  - Mantiene el orden de inserción de los elementos.\n" + //
                "- Buen desempeño en búsquedas (O(1)), similar a HashMap.");
        System.out.println("Desventajas:");
        System.out.println(
                "  - Consume más memoria que HashMap debido al almacenamiento adicional para mantener el orden de inserción.");
        System.out.println("Uso recomendado:");
        System.out.println(
                "  - Adecuado para colecciones en las que se requiere eficiencia en las búsquedas y un orden específico (de inserción).");
    }
}
