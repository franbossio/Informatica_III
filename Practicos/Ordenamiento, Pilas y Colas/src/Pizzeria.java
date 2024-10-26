import java.util.*;
public class Pizzeria {

    public Pizzeria(){}

    public void agregarPedido(List<Pedido> pedido){
        System.out.println("Ingresar la cantidad de pedidos para agregar:");
        int n = new Scanner(System.in).nextInt();
        Random random = new Random();
        String[] nombres = {"Juan", "Ana", "Carlos", "Maria", "Luis", "Elena", "Pedro", "Laura", "Miguel", "Carmen"};
        for (int i = 0; i < n; i++) {
            String nombreCliente = nombres[random.nextInt(nombres.length)];
            int precioTotal = (random.nextInt(500-100+1)+10); // Precio entre 100 y 500
            int tiempoPreparacion = (random.nextInt(60 - 10 + 1 )+10); 
            pedido.add(new Pedido(nombreCliente, precioTotal, tiempoPreparacion));
        }
    }
    
    public void eliminarPedido(List<Pedido> pedido){
        System.out.println("Ingrese el numero de pedido:");
        int n = new Scanner(System.in).nextInt();
        pedido.remove(n-1);
    }

}

