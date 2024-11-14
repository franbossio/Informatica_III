package General;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap5 {
    public void ejecutarLinkedHashMap() {
        LinkedHashMap<String, Objeto> mapaObjetos = new LinkedHashMap<>();
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos objetos desea registrar?: ");
        int totalObjetos = entrada.nextInt();
        entrada.nextLine(); // Limpiar el salto de línea

        // Paso 1: Solicitar información de cada objeto
        for (int i = 1; i <= totalObjetos; i++) {
            System.out.print("Ingrese la clave para el objeto #" + i + ": ");
            String claveObjeto = entrada.nextLine();

            System.out.print("Ingrese el nombre del objeto #" + i + ": ");
            String nombreObjeto = entrada.nextLine();

            System.out.print("Ingrese el valor numérico para el objeto #" + i + ": ");
            int valorObjeto = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer de entrada

            // Añadir el objeto al LinkedHashMap
            mapaObjetos.put(claveObjeto, new Objeto(nombreObjeto, valorObjeto));
        }

        // Paso 2: Mostrar el LinkedHashMap completo
        System.out.println("\nInventario completo de objetos: " + mapaObjetos);

        // Paso 3: Consultar un objeto específico por su clave
        System.out.print("\nIngrese la clave del objeto que desea consultar: ");
        String claveConsulta = entrada.nextLine();
        if (mapaObjetos.containsKey(claveConsulta)) {
            System.out.println("Objeto encontrado: " + mapaObjetos.get(claveConsulta));
        } else {
            System.out.println("No existe un objeto con esa clave.");
        }

        // Paso 4: Eliminar un objeto por su clave
        System.out.print("\nIngrese la clave del objeto que desea eliminar: ");
        String claveEliminar = entrada.nextLine();
        if (mapaObjetos.remove(claveEliminar) != null) {
            System.out.println("Inventario tras eliminar '" + claveEliminar + "': " + mapaObjetos);
        } else {
            System.out.println("No se encontró un objeto con esa clave para eliminar.");
        }
    }
}
