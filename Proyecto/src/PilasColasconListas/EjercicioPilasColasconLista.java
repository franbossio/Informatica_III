package PilasColasconListas;
import java.util.*;

public class EjercicioPilasColasconLista {

    Pila<Integer> pilaEntero = new Pila<>();
    Pila<String> pilaString = new Pila<>();
    Scanner consola = new Scanner(System.in);
    int op, x, op2;

   public void ejecutar(){
    do{
        System.out.println("--------Pilas y colas con listas--------");
        System.out.println("Elegir el ejercicio: ");
        System.out.println("1-Implementación de una Pila con lista");
        System.out.println("2-Implementa una pila que almacene palabras. Luego, desapílalas e imprímelas en orden inverso.");
        System.out.println("3-Verificacion de parentesis");
        System.out.println("4-Convertir decimal a binario");
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
                ejercicio4();
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
                pilaEntero.push(x);
                break;
            case 2:
                pilaEntero.pop();
                System.out.println("Elemento eliminado correctamente");
                break;
            case 3:
                System.out.println("El top es: "+pilaEntero.top());
                break;
            case 4:
                pilaEntero.mostrarPila();
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
            pilaString.push(palabra); 
        }
        
        // Desapilar y mostrar las palabras en orden inverso
        System.out.println("\nPalabras en orden inverso:");
        while (!pilaString.isEmpty()) {
            System.out.println(pilaString.topAndPop()); // Desapilar y mostrar cada palabra
        }
    }

    private void ejercicio3(){
        System.out.println("Ingresa la ecucacion: ");
        consola.nextLine();
        String ecuacion = consola.nextLine();
        for(int i=0;i<ecuacion.length();i++){
            if(ecuacion.charAt(i)=='('){
                pilaString.push("(");;
            }else if(ecuacion.charAt(i)==')'){
                pilaString.pop();
            }
        }
        if(pilaString.isEmpty()){
            System.out.println("Parentesis balanceados");
        }else{
            System.out.println("Parentesis desbalanceados");
        }
    }

    public void ejercicio4(){
        System.out.print("Ingresa un número decimal: ");
        int numeroDecimal = consola.nextInt();

        if (numeroDecimal == 0) {
            System.out.println("El número en binario es: 0");
        } else {
            // Algoritmo de división sucesiva por 2
            while (numeroDecimal > 0) {
                int residuo = numeroDecimal % 2; // Residuo al dividir por 2
                pilaEntero.push(residuo);              // Apilamos el residuo
                numeroDecimal /= 2;              // Actualizamos el número dividiéndolo por 2
            }

            System.out.print("El número en binario es: ");
            // Desapilamos los elementos para formar el número binario
            while (!pilaEntero.isEmpty()) {
                System.out.print(pilaEntero.topAndPop()); // Mostramos el elemento en la cima y lo removemos
            }
            System.out.println();
    }
}
}