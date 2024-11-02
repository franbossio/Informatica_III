package MonticuloBinario;

import java.util.Scanner;

public class EjercicioMonticuloBinario {
    MonticuloBinario m = new MonticuloBinario();
    Scanner consola = new Scanner(System.in);
    int op,x;
    public void ejecutar(){
        ejercicio1();
    }

    private void ejercicio1(){
        do {
            System.out.println("---------Monticulo Binario---------");
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Insertar elementos");
            System.out.println("2-Eliminar el menor");
            System.out.println("3-Mostrar el menor");
            System.out.println("4-Imprimir el montiulo binario");
            System.out.println("5-Salir");
            op=consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa el elemento para agregar:");
                    x=consola.nextInt();
                    m.agregar(x);
                    break;
                case 2:
                    System.out.println("Numero "+m.eliminar()+" eliminado");
                    break;
                case 3:
                    System.out.println("El Minimo es: "+m.buscar_minimo());
                    break;
                case 4:
                    m.imprimir();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        } while (op!=5);
           
    }


}
