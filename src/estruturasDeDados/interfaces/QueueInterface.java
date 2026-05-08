package estruturasDeDados.interfaces;

public interface QueueInterface<T> {
    void enqueue(T elemento);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}

