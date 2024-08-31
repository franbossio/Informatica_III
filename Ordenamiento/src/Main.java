
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedido=new ArrayList<>();
        Scanner consola=new Scanner(System.in);
        int op;
        Pizzeria pizzeria = new Pizzeria();
        Ordenador ordenar= new Ordenador();
       do { 
            System.out.println("Elige una opcion:");
            System.out.println("1-Ordenar por timepo");
            System.out.println("2-Ordenar por precio total");
            System.out.println("3-Ordenar por nombre del cliente");
            System.out.println("4-Mostrar lista de pedidos");
            System.out.println("5-Agregar pedido");
            System.out.println("6-Eliminar pedido");
            System.out.println("7-Salir del sistema");
            op=consola.nextInt();
            switch (op) {
                case 1:
                ordenar.inserccion(pedido);
                    break;
                case 2:
                    ordenar.shellsort(pedido);
                    break;
                case 3:
                    ordenar.quickSort(pedido,0 ,pedido.size()-1 );
                    break;
                case 4: 
                for (Object e : pedido) {
                    System.out.println(e);
                }
                    break;
                case 5:
                    pizzeria.agregarPedido(pedido);
                    break;
                case 6: 
                    pizzeria.eliminarPedido(pedido);
                    break;

            }
        } while (op!=7);
        

    }
   
       

    
}
