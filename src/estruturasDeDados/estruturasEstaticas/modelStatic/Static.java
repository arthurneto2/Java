package estruturasDeDados.estruturasEstaticas.modelStatic;

public abstract class Static<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public Static(int capacidade) {
        this.array = (T[]) new Object[capacidade];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    protected void redimensionar() {
        T[] elementosNovos = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, elementosNovos, 0, array.length);
        array = elementosNovos;
    }

    protected void adicionar(T elemento) {
        if (size == array.length) {
            redimensionar();
        }
        array[size++] = elemento;
    }

    protected void upSize() {
        this.size++;
    }

    protected void downSize() {
        this.size--;
    }

    public int size() {
        return size;
    }

    protected T[] getArray() {
        return array;
    }

    public void limpar() {
        for (int i = 0; i < size(); i++) {
            array[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
