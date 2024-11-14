package General;

public class Objeto {
    private String nombre;
    private int valor;

    public Objeto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" + nombre + " = " + valor + "}";
    }
}