
package estruturasDeDados.estruturasEstaticas.fila;

import estruturasDeDados.interfaces.QueueInterface;


public class PriorityQueue<T> extends Queue<T> implements QueueInterface<T> {

    public PriorityQueue(int capacidade) {
        super(capacidade);
    }

    public PriorityQueue() {super(10);}

    @Override
    @SuppressWarnings("unchecked")
    public void enqueue(T elemento) {
        if (size() == 0) {
            super.enqueue(elemento);
        } else {
            Comparable<T> aux = (Comparable<T>) elemento;
            int i;
            for (i = getIndexLastElement(); i >= 0; i--) {
                if (aux.compareTo(get(i)) > 0) {
                    getArray()[i + 1] = get(i);
                } else {
                    break;
                }
            }
            getArray()[i + 1] = elemento;
            upSize();
            updateIndexLastElement();
        }
    }


}
