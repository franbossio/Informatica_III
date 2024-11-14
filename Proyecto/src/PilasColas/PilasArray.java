package PilasColas;

import PilasColasconListas.UnderflowException;

class PilasArray<T> {
    private T[] a;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;

    public PilasArray() {
        a = (T[]) new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    public void push(T x) { // insertar a la pila
        if (topOfStack + 1 == a.length) {
            doubleArray();
        } else {
            a[++topOfStack] = x;
        }
    }

    public int getTopOfStack() {
        return topOfStack;
    }

    public void pop() { // quitar lo que se agrego ultimo
        if (isEmpty()) {
            throw new UnderflowException("ArrayStack pop");
        } else {
            topOfStack--;
        }
    }

    public T top() { // devolver el valor del top
        if (isEmpty()) {
            throw new UnderflowException("ArrayStack top");
        } else {
            return a[topOfStack];
        }
    }

    public T topAndPop() { // devolver y remover el valor del top
        if (isEmpty()) {
            throw new UnderflowException("ArrayStack top");
        } else {
            return a[topOfStack--];
        }
    }

    public boolean isEmpty() {// verificar si la pila esta vacia
        return topOfStack == -1;
    }

    public void makeEmty() { /// hacer la pila vacia
        topOfStack = -1;
    }

    private void doubleArray() {
        a = (T[]) new Object[a.length * 2];
    }

    public void mostrarPila() {
        for (int i = 0; i <= topOfStack; i++) {
            System.out.println(a[i]);
        }
    }
}
