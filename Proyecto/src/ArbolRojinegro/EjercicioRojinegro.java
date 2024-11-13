package ArbolRojinegro;

import java.util.Scanner;

public class EjercicioRojinegro {
    public void ejecutar() {
        ArbolRojinegro arbolRojinegro = new ArbolRojinegro();
        Scanner consola = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("----------Arbol Rojinegro----------");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Inserción en un Árbol Rojinegro y Eliminación en un Árbol Rojinegro");
            System.out.println("2. Verificación de Propiedades y Altura Negra");
            System.out.println("3-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste el 1° ejercicio----------");
                    do {
                        System.out.println("Ingresa una opcion:");
                        System.out.println("1-Insertar elementos");
                        System.out.println("2-Imprimir el arbol");
                        System.out.println("3-Salir");
                        op = consola.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Ingresa un elemento:");
                                int x = consola.nextInt();
                                arbolRojinegro.insertar(x);
                                break;
                            case 2:
                                arbolRojinegro.mostrar(arbolRojinegro.getRaiz(), "", true, true);
                                break;
                            case 3:
                                System.out.println("Adios");
                                break;
                        }
                    } while (op != 3);
                    break;
                case 2:
                    System.out.println("----------Elegiste el 2° ejercicio----------");
                    System.out.println("¿El arbol cumple con las propiedades rojinegras? "
                            + arbolRojinegro.verificarPropiedadesRojinegras());
                    System.out.println("Su altura es: " + arbolRojinegro.calcularAlturaNegra());
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        } while (op != 3);
    }
}
