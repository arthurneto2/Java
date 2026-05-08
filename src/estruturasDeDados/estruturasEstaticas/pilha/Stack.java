package estruturasDeDados.estruturasEstaticas.pilha;

import estruturasDeDados.estruturasEstaticas.arrayList.ArrayList;
import estruturasDeDados.estruturasEstaticas.interfaces.StackInterface;

public class Stack<T> extends ArrayList<T> implements StackInterface<T> {

    public Stack(int capacidade) {
        super(capacidade);
    }

    public Stack() {
        super(10);
    }


    public void push(T elemento) {
        add(elemento);
    }


    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        T elemento = (T) getArray()[getIndexLastElement()];
        getArray()[getIndexLastElement()] = null; // evita memory leak
        downSize();
        updateIndexLastElement();
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        return (T) getArray()[getIndexLastElement()];
    }
}
