package estruturasDeDados.arrayList;

public class ArrayDinamico<T>{
    private T[] array;
    private int size;
    private static final int capacidade = 100;

    @SuppressWarnings("unchecked")
    public ArrayDinamico() {
        this.array = (T[]) new Object[capacidade];
        this.size = 0;
    }

    public void adicionar(T elemento) {
        if (size == array.length) {
            redimensionar();
        }
        array[size++] = elemento;
    }

    public void adicionar(int posicao, T elemento) {
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (size == array.length) {
            redimensionar();
        }
        for (int i = size; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        size++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        for (int i = posicao; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null; // evita memory leak
        size--;
    }

    public void remover(T elemento) {
        int posicao = busca(elemento);
        if (posicao != -1) {
            remover(posicao);
        }
    }

    public int busca(T elemento) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                if (elemento == null) return i;
            } else if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T busca(int posicao) {
        if (posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return array[posicao];
    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        T[] elementosNovos = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, elementosNovos, 0, array.length);
        array = elementosNovos;
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

    public int size() {
        return size;
    }
}
