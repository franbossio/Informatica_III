package PilasColasconListas;
import java.util.*;
public class EjercicioPilasColasconLista {

   public void ejecutar(){
    Pila p = new Pila();
    Scanner consola = new Scanner(System.in);
    int op, x, op2;
    do{
        System.out.println("--------Pilas y colas con listas--------");
        System.out.println("Elegir el ejercicio: ");
        System.out.println("1-Implementación de una Pila con lista");
        System.out.println("2-");
        System.out.println("3-");
        System.out.println("4-");
        System.out.println("5-Salir");
        op = consola.nextInt();
        switch (op) {
            case 1:
            System.out.println("----------Elegiste el 1° ejercicio----------");
                System.out.println("Ingresa una opcion:");
                System.out.println("1-Agregar elementos");
                System.out.println("2-Eliminar elemento");
                System.out.println("3-Mostrar el top");
                System.out.println("4-Mostrar pila");
                op2=consola.nextInt();
                switch (op2) {
                    case 1:
                        System.out.println("Ingresa el elemento para agregar:");
                        x=consola.nextInt();
                        p.push(x);
                        break;
                    case 2:
                        p.pop();
                        System.out.println("Elemento eliminado correctamente");
                        break;
                    case 3:
                        System.out.println("El top es: "+p.top());
                        break;
                    case 4:
                        p.mostrarPila();
                        break;
                }
                break;
            case 2:
                System.out.println("----------Elegiste el 2° ejercicio----------");
                
                break;
            case 3:
                System.out.println("----------Elegiste el 3° ejercicio----------");
               
                break;
            case 4:
                System.out.println("----------Elegiste el 4° ejercicio----------");
               
                break;
            case 5:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }while(op!=5);
    
}
   
    
}