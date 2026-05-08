package estruturasDeDados.estruturasEstaticas.interfaces;

public interface ListInterface<T> {
    void add(T elemento);
    void add(int posicao, T elemento);
    void remove(int posicao);
    void remove(T elemento);
    int indexOf(T elemento);
    T get(int posicao);
    boolean contains(T elemento);
    int lastIndexOf(T elemento);
    int size();
    void clean();
    boolean isEmpty();
}

