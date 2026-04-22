package estruturasDeDados.estruturasEstaticas.pilha;

import estruturasDeDados.estruturasEstaticas.modelStatic.Static;

public class Stack<T> extends Static<T> {

    public Stack(int capacidade) {
        super(capacidade);
    }

    public Stack() {
        super(10);
    }


    public void push(T elemento) {
        super.add(elemento);
    }


    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        T elemento = getArray()[getIndexLastElement()];
        getArray()[getIndexLastElement()] = null; // evita memory leak
        downSize();
        updateIndexLastElement();
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        return getArray()[getIndexLastElement()];
    }
}
