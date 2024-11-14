package General;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {
    public void ejecutarHashMap() {
        HashMap<String, Objeto> directorio = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de usuarios que desea registrar: ");
        int cantidadUsuarios = entrada.nextInt();
        entrada.nextLine(); // Limpieza del salto de línea

        // Paso 1: Agregar usuarios al HashMap
        for (int i = 1; i <= cantidadUsuarios; i++) {
            System.out.print("Ingrese el nombre del usuario " + i + ": ");
            String nombreUsuario = entrada.nextLine();
            System.out.print("Ingrese el número telefónico del usuario " + i + ": ");
            int numeroTelefono = entrada.nextInt();
            entrada.nextLine(); // Limpieza del buffer de entrada
            directorio.put("contacto" + i, new Objeto(nombreUsuario, numeroTelefono));
        }

        // Paso 2: Imprimir el HashMap completo
        System.out.println("Directorio completo: " + directorio);

        // Paso 3: Visualizar un usuario específico
        System.out.print("Ingrese la clave del contacto que desea consultar: ");
        String claveConsulta = entrada.nextLine();
        if (directorio.containsKey(claveConsulta)) {
            System.out.println(claveConsulta + " = " + directorio.get(claveConsulta));
        } else {
            System.out.println("No existe un contacto con esa clave.");
        }

        // Paso 4: Eliminar un usuario del directorio
        System.out.print("Ingrese la clave del contacto que desea eliminar: ");
        String claveEliminar = entrada.nextLine();
        if (directorio.remove(claveEliminar) != null) {
            System.out.println("Directorio después de eliminar '" + claveEliminar + "': " + directorio);
        } else {
            System.out.println("No se encontró un contacto con esa clave para eliminar.");
        }
    }
}
