public class Main {
    public static void main(String[] args) {
        MonticuloBinario monticulo = new MonticuloBinario();
        monticulo.agregar(2);
        monticulo.agregar(5);
        monticulo.agregar(10);
        monticulo.agregar(1);
        System.out.println("-------------------------------------------");
        System.out.println("El minimo valor es: "+monticulo.buscar_minimo());
        System.out.println("-------------------------------------------");
        monticulo.imprimir();
        System.out.println("-------------------------------------------");
        System.out.println("Valor "+monticulo.eliminar()+" eliminado");
        monticulo.imprimir();
    }
}
