import java.util.*;
public class Ordenador {
    public void inserccion(List<Pedido> pedido){
        int n=pedido.size();
        for (int i=1;i<n;i++) {
            for (int j=i; j>0 && pedido.get(j).getTiempo() < pedido.get(j-1).getTiempo() ; j--) {
                Pedido aux = pedido.get(j-1);
                pedido.set(j-1, pedido.get(j));
                pedido.set(j, aux);
            }
        }
        /*for (int i = 1; i < pedidos.size(); i++) {
            Pedido key = pedidos.get(i);
            int j = i - 1;
            while (j >= 0 && pedidos.get(j).getTiempo() > key.getTiempo()) {
                pedidos.set(j + 1, pedidos.get(j));
                j = j - 1;
            }
            pedidos.set(j + 1, key);
        }*/

    }
}
