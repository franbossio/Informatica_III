package TablaHash;

import java.util.Scanner;

public class EjercicioTablaHash {
    public void ejecutar(){
        Scanner consola = new Scanner(System.in);
        TablaHash tablaHash = new TablaHash();
        int op;
        do {
            System.out.println("---------Tabla Hash---------");
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Insertar elementos");
            System.out.println("2-Eliminar un elemento");
            System.out.println("3-Buscar un elemento");
            System.out.println("4-Imprimir la tabla");
            System.out.println("5-Salir");
            op=consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa la clave:");
                    consola.nextLine();
                    String clave = consola.nextLine();
                    System.out.println("Ingresa el elemento:");
                    int x=consola.nextInt();
                    tablaHash.insertar(clave, x);
                    break;
                case 2:
                    System.out.println("Ingresa la clave para eliminar el elemento:");
                    consola.nextLine();
                    String eliminar = consola.nextLine();
                    tablaHash.eliminar(eliminar);
                    break;
                case 3:
                    System.out.println("Ingresa la clave para buscar el elemento:");
                    consola.nextLine();
                    String buscar = consola.nextLine();
                    System.out.println("Su elemento es: "+tablaHash.buscar(buscar));
                    break;
                case 4:
                    tablaHash.imprimir();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        } while (op!=5);
        consola.close();
    }
}
