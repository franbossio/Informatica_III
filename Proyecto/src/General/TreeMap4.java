package General;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap4 {
    public void ejecutarTreeMap() {
        Scanner entrada = new Scanner(System.in);
        TreeMap<String, Objeto> inventarioVehiculos = new TreeMap<>();

        System.out.print("¿Cuántos vehículos desea registrar?: ");
        int totalVehiculos = entrada.nextInt();
        entrada.nextLine(); // Limpieza del salto de línea

        // Paso 1: Agregar vehículos al TreeMap
        for (int i = 1; i <= totalVehiculos; i++) {
            System.out.print("Ingrese el modelo del vehículo #" + i + ": ");
            String modeloVehiculo = entrada.nextLine();
            System.out.print("Ingrese el precio del vehículo #" + i + ": ");
            int precioVehiculo = entrada.nextInt();
            entrada.nextLine(); // Limpieza del salto de línea

            inventarioVehiculos.put("auto" + i, new Objeto(modeloVehiculo, precioVehiculo));
        }

        System.out.println("\nInventario completo de vehículos: " + inventarioVehiculos);

        // Paso 2: Buscar y mostrar un vehículo específico
        System.out.print("\nIngrese la clave del vehículo que desea consultar: ");
        String claveBusqueda = entrada.nextLine();
        if (inventarioVehiculos.containsKey(claveBusqueda)) {
            System.out.println("Vehículo encontrado: " + inventarioVehiculos.get(claveBusqueda));
        } else {
            System.out.println("No se encontró un vehículo con esa clave.");
        }

        // Paso 3: Eliminar un vehículo
        System.out.print("\nIngrese la clave del vehículo que desea eliminar: ");
        String claveEliminar = entrada.nextLine();
        if (inventarioVehiculos.remove(claveEliminar) != null) {
            System.out.println("Inventario tras eliminar el vehículo " + claveEliminar + ": " + inventarioVehiculos);
        } else {
            System.out.println("No se encontró un vehículo con esa clave para eliminar.");
        }

    }
}
