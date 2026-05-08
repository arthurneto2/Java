package estruturasDeDados.estruturasEstaticas.interfaces;

public interface StackInterface<T> {
    void push(T elemento);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}

