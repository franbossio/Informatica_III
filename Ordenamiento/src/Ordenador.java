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

    }
}
