package TablaHash;


import java.util.LinkedList;

public class TablaHash {
    // Tamaño de la tabla
    private static final int CAPACIDAD = 10;
    // Array de listas enlazadas para manejar colisiones
    private LinkedList<Elemento>[] tabla;

    // Clase interna para representar un elemento (par clave-valor)
    private class Elemento {
        String clave;
        int valor;

        public Elemento(String clave, int valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    // Constructor: inicializa la tabla con listas vacías
    public TablaHash() {
        tabla = new LinkedList[CAPACIDAD];
        for (int i = 0; i < CAPACIDAD; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    // Método hash para convertir una clave en un índice
    private int hash(String clave) {
        return Math.abs(clave.hashCode()) % CAPACIDAD;
    }

    // Inserción: agrega un elemento a la tabla hash
    public void insertar(String clave, int valor) {
        int indice = hash(clave);
        // Verificar si la clave ya existe, actualiza el valor
        for (Elemento elem : tabla[indice]) {
            if (elem.clave.equals(clave)) {
                elem.valor = valor;
                return;
            }
        }
        // Si no existe, agregamos un nuevo elemento
        tabla[indice].add(new Elemento(clave, valor));
    }

    // Búsqueda: busca un elemento en la tabla hash por su clave
    public Integer buscar(String clave) {
        int indice = hash(clave);
        // Buscar el elemento con la clave en la lista enlazada
        for (Elemento elem : tabla[indice]) {
            if (elem.clave.equals(clave)) {
                return elem.valor;
            }
        }
        return null; // Si no se encuentra, retornar null
    }

    // Eliminación: elimina un elemento de la tabla hash por su clave
    public boolean eliminar(String clave) {
        int indice = hash(clave);
        // Buscar y eliminar el elemento con la clave en la lista enlazada
        for (Elemento elem : tabla[indice]) {
            if (elem.clave.equals(clave)) {
                tabla[indice].remove(elem);
                return true; // Eliminación exitosa
            }
        }
        return false; // Si no se encuentra, retornar false
    }

    // Método para imprimir la tabla hash completa (para verificar contenido)
    public void imprimir() {
        for (int i = 0; i < CAPACIDAD; i++) {
            System.out.print("Índice " + i + ": ");
            for (Elemento elem : tabla[i]) {
                System.out.print("{" + elem.clave + ": " + elem.valor + "} ");
            }
            System.out.println();
        }
    }
}
