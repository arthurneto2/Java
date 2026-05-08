
package estruturasDeDados.estruturasEstaticas.fila;

import estruturasDeDados.interfaces.QueueInterface;

public class PriorityQueue<T extends Comparable<T>> extends Queue<T> implements QueueInterface<T> {

    public PriorityQueue(int capacidade) {
        super(capacidade);
    }

    public PriorityQueue() {super(10);}

    @Override
    public void enqueue(T elemento) {
        if (size() == 0) {
            super.enqueue(elemento);
        } else {
            int i;
            for (i = size() - 1; i >= 0; i--) {
                if (elemento.compareTo((T) getArray()[i]) > 0) {
                    getArray()[i + 1] = getArray()[i];
                } else {
                    break;
                }
            }
            add(i + 1, elemento);
            upSize();
            updateIndexLastElement();
        }
    }


}
