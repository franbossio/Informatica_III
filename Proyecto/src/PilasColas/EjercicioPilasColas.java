package PilasColas;
import java.util.*;

public class EjercicioPilasColas {
    Scanner consola = new Scanner(System.in);
    int op, op2;
    PilasArray<Integer> pilaArrayEntero = new PilasArray<>();
    PilasArray<String> pilasArrayString = new PilasArray<>();
    ColasArray colasArray = new ColasArray(); 
    
    public void ejecutar(){
        do{
            System.out.println("--------Pilas y colas con listas--------");
            System.out.println("Elegir el ejercicio: ");
            System.out.println("1-Implementación de una Pila");
            System.out.println("2-Comprobación de Palíndromos");
            System.out.println("3-Expresiones Matemáticas");
            System.out.println("4-Implementación de una Cola");
            System.out.println("5-Ordenar una Cola");
            System.out.println("6-Salir");
            op = consola.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------Elegiste el 1° ejercicio----------");
                    pilaArrayEntero.makeEmty();
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("----------Elegiste el 2° ejercicio----------");
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("----------Elegiste el 3° ejercicio----------");
                    pilasArrayString.makeEmty();
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("----------Elegiste el 4° ejercicio----------");
                    colasArray.makeEmpty();
                    ejercicio4();
                    break;
                case 5:
                    System.out.println("----------Elegiste el 5° ejercicio----------");
                    ejercicio5();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=6);
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
                    int x=consola.nextInt();
                    pilaArrayEntero.push(x);
                    break;
                case 2:
                    System.out.println("Elemento "+pilaArrayEntero.topAndPop()+" eliminado.");
                    break;
                case 3:
                    System.out.println("El top es: "+pilaArrayEntero.top());
                    break;
                case 4:
                    pilaArrayEntero.mostrarPila();
                    break;
            }
        } while (op2!=5);
    }

    private void ejercicio2(){
        PilasArray<Character> pilaArrayNormal = new PilasArray<>();
        PilasArray<Character> pilaArrayInversa = new PilasArray<>();

        boolean bandera = false;
        System.out.println("Ingresa una palabra o frase:");
        consola.nextLine();
        String palabra = consola.nextLine();
        // Normalizar la frase: convertir a minúsculas, quitar espacios y signos de puntuación
        palabra = palabra.toLowerCase().replaceAll("[^a-z0-9]", "");

        //ingresar cada letra a una pila
        for(int i = 0; i < palabra.length();i++){
            pilaArrayNormal.push(palabra.charAt(i));
        }
        
        //ingresar cada letra pero con la palabra inversa
        for(int i = palabra.length()-1; i >= 0; i--){
            pilaArrayInversa.push(palabra.charAt(i));
        }

        while (!pilaArrayNormal.isEmpty()) {
            // Si algún par de caracteres no coincide, no es un palíndromo
            if (!pilaArrayNormal.topAndPop().equals(pilaArrayInversa.topAndPop())) {
                bandera=true;
            }
        }

        if(bandera){
            System.out.println("La palabra o frase no es un palíndromo.");
        }else{
            System.out.println("La palabra o frase es un palíndromo.");
        }
    }

    private void ejercicio3(){
        System.out.println("Ingresa la ecucacion: ");
        consola.nextLine();
        String ecuacion = consola.nextLine();
        for(int i=0;i<ecuacion.length();i++){
            if(ecuacion.charAt(i)=='('){
                pilasArrayString.push("(");;
            }else if(ecuacion.charAt(i)==')'){
                pilasArrayString.pop();
            }
        }
        if(pilasArrayString.isEmpty()){
            System.out.println("Parentesis balanceados");
        }else{
            System.out.println("Parentesis desbalanceados");
        }
    }

    private void ejercicio4(){
        do {
            System.out.println("Ingresa una opcion:");
            System.out.println("1-Agregar elementos");
            System.out.println("2-Eliminar elemento");
            System.out.println("3-Mostrar el frente");
            System.out.println("4-Mostrar cola");
            System.out.println("5-Salir");
            op2=consola.nextInt();
            switch (op2) {
                case 1:
                    System.out.println("Ingresa el elemento para agregar:");
                    int x=consola.nextInt();
                    colasArray.enqueue(x);
                    break;
                case 2:
                    System.out.println("Elemento "+colasArray.dequeue()+" eliminado.");
                    break;
                case 3:
                    System.out.println("El frente es: "+colasArray.mostrarFrente());
                    break;
                case 4:
                    colasArray.mostrarCola();
                    break;
            }
        } while (op2!=5);
    }

    private void ejercicio5(){
        ColasArray colaAuxiliar = new ColasArray();
        ColasArray colaOriginal = new ColasArray();

        System.out.println("Ingresar el tamaño de la cola:");
        int size = consola.nextInt();
        System.out.println("Ingresar los elementos a la cola");
        for(int i = 0; i<size;i++){
            int x = consola.nextInt();
            colaOriginal.enqueue(x);
        }
        
        while (!colaOriginal.isEmpty()) {
            int elementoActual = colaOriginal.dequeue();  // Desencola de la cola original
            
            // Mueve los elementos a la cola original para encontrar la posición correcta
            while (!colaAuxiliar.isEmpty() && colaAuxiliar.mostrarFrente() < elementoActual) {
                colaOriginal.enqueue(colaAuxiliar.dequeue());
            }
            
            // Agrega el elemento en su posición en la cola auxiliar
            colaAuxiliar.enqueue(elementoActual);
            
            // Devuelve los elementos desde colaOriginal a colaAuxiliar
            while (!colaOriginal.isEmpty() && (colaAuxiliar.isEmpty() || colaOriginal.mostrarFrente() <= colaAuxiliar.mostrarFrente())) {
                colaAuxiliar.enqueue(colaOriginal.dequeue());
            }
        }
        
        // Copia los elementos ordenados de la colaAuxiliar a la colaOriginal
        while (!colaAuxiliar.isEmpty()) {
            colaOriginal.enqueue(colaAuxiliar.dequeue());
        }

        System.out.println("Cola ordenada: ");
        colaOriginal.mostrarCola();
    }
}
