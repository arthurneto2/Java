package estruturasDeDados.estruturasEstaticas.arrayList;

import estruturasDeDados.interfaces.ListInterface;

public class ArrayList<T> implements ListInterface<T> {

    private T[] array;
    private int size;
    private int indexLastElement;

    @SuppressWarnings("unchecked")
    public ArrayList(int capacidade) {
        this.array = (T[]) new Object[capacidade];
        this.size = 0;
        this.indexLastElement = -1;
    }

    public ArrayList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    protected void resize() {
        T[] elementosNovos = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, elementosNovos, 0, array.length);
        array = elementosNovos;
    }

    public void add(T elemento) {
        if (size == array.length) {
            resize();
        }
        array[size++] = elemento;
        updateIndexLastElement();
    }

    // Java-style overload to keep compatibility: add at index
    public void add(int posicao, T elemento) {
        if (posicao < 0 || posicao > this.size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (this.size() == this.getArray().length) {
            this.resize();
        }
        for (int i = this.size(); i > posicao; i--) {
            this.getArray()[i] = this.getArray()[i - 1];
        }
        this.getArray()[posicao] = elemento;
        this.upSize();
        updateIndexLastElement();
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        for (int i = posicao; i < this.size() - 1; i++) {
            this.getArray()[i] = this.getArray()[i + 1];
        }
        this.getArray()[this.size() - 1] = null; // evita memory leak
        downSize();
        updateIndexLastElement();
    }

    public void remove(T elemento) {
        int posicao = indexOf(elemento);
        if (posicao != -1) {
            remove(posicao);
        }
    }

    public int indexOf(T elemento) {
        for (int i = 0; i < size(); i++) {
            if (this.getArray()[i] == null) {
                if (elemento == null) return i;
            } else if (this.getArray()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }


    public T get(int posicao) {
        if (posicao < 0 || posicao >= size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return getArray()[posicao];
    }

    public boolean contains(T elemento) {
        return indexOf(elemento) != -1;
    }

    public int lastIndexOf(T elemento) {
        for (int i = size() - 1; i >= 0; i--) {
            if (getArray()[i] == null) {
                if (elemento == null) return i;
            } else if (getArray()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    protected void updateIndexLastElement() {
        this.indexLastElement = size - 1;
    }

    protected int getIndexLastElement() {
        return indexLastElement;
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

    public void clean() {
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
