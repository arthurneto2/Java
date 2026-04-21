package estruturasDeDados.arrayList;

public class ArrayDinamico {
    private String[] array;
    private int size;
    private static final int capacidade = 100;

    public ArrayDinamico() {
        this.array = new String[capacidade];
        this.size = 0;
    }

    public void adicionar(String elemento) {
        if (size == array.length) {
            redimensionar();
        }
        array[size++] = elemento;
    }

    public void adicionar(int posicao, String elemento) {
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
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        for (int i = posicao; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remover(String elemento) {
        int posicao = busca(elemento);
        if (posicao != -1) {
            remover(posicao);
        }
    }

    public int busca(String elemento) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public String busca(int posicao) {
        if (posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return array[posicao];
    }

    private void redimensionar() {
        String[] elementosNovos = new String[array.length * 2];
        System.arraycopy(array, 0, elementosNovos, 0, array.length);
        array = elementosNovos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        if (size > 0) {
            sb.append(array[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return size;
    }
}
