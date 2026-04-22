package estruturasDeDados.pilha;

public class Stack<T> {
    private T[] stack;
    private int topo;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack(int capacidade) {
        this.stack = (T[]) new Object[capacidade];
        this.topo = -1;
        this.size = 0;
    }

    public Stack() {
        this(10);
    }

    public void redimensionar() {
        int novaCapacidade = stack.length * 2;
        @SuppressWarnings("unchecked")
        T[] novoArray = (T[]) new Object[novaCapacidade];
        System.arraycopy(stack, 0, novoArray, 0, stack.length);
        stack = novoArray;
    }

    public void push(T elemento) {
        if (size == stack.length) {
            redimensionar();
        }
        stack[++topo] = elemento;
        size++;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        T elemento = stack[topo];
        stack[topo--] = null; // evita memory leak
        size--;
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        return stack[topo];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [");
        for (int i = topo; i >= 0; i--) {
            sb.append(stack[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
