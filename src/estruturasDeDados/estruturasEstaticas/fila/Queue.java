
package estruturasDeDados.estruturasEstaticas.fila;

import estruturasDeDados.estruturasEstaticas.arrayList.ArrayList;
import estruturasDeDados.interfaces.QueueInterface;

public class Queue<T> extends ArrayList<T> implements QueueInterface<T> {

    public Queue(int capacidade) {
        super(capacidade);
    }

    public Queue() {super(10);}

    public void enqueue(T elemento) {
        add(elemento);
    }

    public T dequeue() {
        T objeto = (T) getArray()[0];
        for (int i = 0; i < size() - 1; i++) {
            getArray()[i] = getArray()[i + 1];
        }
        getArray()[size() -1] = null;
        downSize();
        updateIndexLastElement();
        return objeto;
    }

    public T peek() {
        return (T) getArray()[0];
    }

}
