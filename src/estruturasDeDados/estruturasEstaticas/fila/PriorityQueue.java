package estruturasDeDados.estruturasEstaticas.fila;

public class PriorityQueue<T> extends Queue<T>{

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
            int i;
            for (i = size() - 1; i >= 0; i--) {
                if (((Comparable<T>) elemento).compareTo(getArray()[i]) > 0) {
                    getArray()[i + 1] = getArray()[i];
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
