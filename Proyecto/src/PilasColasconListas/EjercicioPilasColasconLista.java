package PilasColasconListas;
import java.util.*;
public class EjercicioPilasColasconLista {

    Pila p = new Pila();
    Scanner consola = new Scanner(System.in);
    int op, x, op2;
    String ecuacion;

   public void ejecutar(){
    do{
        System.out.println("--------Pilas y colas con listas--------");
        System.out.println("Elegir el ejercicio: ");
        System.out.println("1-Implementación de una Pila con lista");
        System.out.println("2-Implementa una pila que almacene palabras. Luego, desapílalas e imprímelas en orden inverso.");
        System.out.println("3-Verificacion de parentesis");
        System.out.println("4-");
        System.out.println("5-Salir");
        op = consola.nextInt();
        switch (op) {
            case 1:
            System.out.println("----------Elegiste el 1° ejercicio----------");
                ejercicio1();
                break;
            case 2:
                System.out.println("----------Elegiste el 2° ejercicio----------");
                ejercicio2();
                break;
            case 3:
                System.out.println("----------Elegiste el 3° ejercicio----------");
                ejercicio3();
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
   private void ejercicio1(){
    do {
        System.out.println("Ingresa una opcion:");
        System.out.println("1-Agregar elementos");
        System.out.println("2-Eliminar elemento");
        System.out.println("3-Mostrar el top");
        System.out.println("4-Mostrar pila");
        System.out.println("5-Salir");
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
    } while (op2!=5);
       
   }
    private void ejercicio2(){
        System.out.println("Ingrese palabras para apilar. Escriba 'fin' para terminar:");
        while (true) {
            String palabra = consola.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            p.push(palabra); 
        }
        
        // Desapilar y mostrar las palabras en orden inverso
        System.out.println("\nPalabras en orden inverso:");
        while (!p.isEmptyString()) {
            System.out.println(p.topAndPop2()); // Desapilar y mostrar cada palabra
        }
    }

    private void ejercicio3(){
        System.out.println("Ingresa la ecucacion: ");
        ecuacion=consola.nextLine();
        

        for(int i=0;i<ecuacion.length();i++){
            if(ecuacion.charAt(i)=='('){
                p.push("(");;
            }else if(ecuacion.charAt(i)==')'){
                p.popString();
            }
        }
        if(p.isEmptyString()){
            System.out.println("Parentesis balanceados");
        }else{
            System.out.println("Parentesis desbalanceados");
        }
    }
}