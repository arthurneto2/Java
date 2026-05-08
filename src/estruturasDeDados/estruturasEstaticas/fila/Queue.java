package estruturasDeDados.estruturasEstaticas.fila;

import estruturasDeDados.estruturasEstaticas.modelStatic.Static;

public class Queue<T> extends Static<T> {

    public Queue(int capacidade) {
        super(capacidade);
    }

    public Queue() {super(10);}

    public void enqueue(T elemento) {
        super.add(elemento);
    }

    public T dequeue() {
        T objeto = getArray()[0];
        for (int i = 0; i < size() - 1; i++) {
            getArray()[i] = getArray()[i + 1];
        }
        getArray()[size() -1] = null;
        downSize();
        updateIndexLastElement();
        return objeto;
    }

    public T peek() {
        return getArray()[0];
    }

}
