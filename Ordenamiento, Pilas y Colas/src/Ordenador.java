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

    public void shellsort(List<Pedido> pedidos) {
        int n = pedidos.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Pedido temp = pedidos.get(i);
                int j;
                for (j = i; j >= gap && pedidos.get(j - gap).getPrecio() > temp.getPrecio(); j -= gap) {
        
                    pedidos.set(j, pedidos.get(j - gap));
                }
                pedidos.set(j, temp);
                }
            }
        }
        
        public void quickSort(List<Pedido> pedidos, int low, int high) {
            if (low < high) {
                int pi = partition(pedidos, low, high);
                quickSort(pedidos, low, pi - 1);
                quickSort(pedidos, pi + 1, high);
            }
        }
    
        private int partition(List<Pedido> pedidos, int low, int high) {
            Pedido pivot = pedidos.get(high);
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (pedidos.get(j).getUsuario().compareTo(pivot.getUsuario()) < 0) {
                    i++;
                    Pedido temp = pedidos.get(i);
                    pedidos.set(i, pedidos.get(j));
                    pedidos.set(j, temp);
                }
            }
            Pedido temp = pedidos.get(i + 1);
            pedidos.set(i + 1, pedidos.get(high));
            pedidos.set(high, temp);
            return i + 1;
        }
}
