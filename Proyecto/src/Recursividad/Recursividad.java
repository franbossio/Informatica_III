package Recursividad;

public class Recursividad {
    public int factorial(int x){
        if(x==0){
            return 1;
        }
        return x*factorial(x-1);
    }

    public int suma(int x){
        if (x==1) {
            return 1;
        }
        return x+suma(x-1);
    }

    public int fibonacci(int x){
        if(x<=1){
            return x;
        
        }
        return fibonacci(x-1)+fibonacci(x-2);
    }
    
    public int potencia(int a,int b){
        if (b==0) {
            return 1;
        }
        return a*potencia(a, b-1);
    }

    public String conteo(int x){
        if(x==1){
            return "1";
        }
        return x+","+conteo(x-1);
    }

    public int producto(int x, int y){
        if(y<=1){
            return x;
        }
        return x+producto(x, y-1);
    }

    public void imprimirInverso(int[] arreglo, int index) {
        if (index == arreglo.length) {
            return;
        }
        imprimirInverso(arreglo, index + 1);
        System.out.print(arreglo[index] + " ");
    }

    public int contarUnos(int N) {
        if (N == 0) {
            return 0;
        }
        return contarUnos(N / 2) + (N % 2);
    }
}