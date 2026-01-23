package estruturasDeDados.arrayList;

public class ArrayDinamico {
    private String[] elementos;
    private int size;
    private static final int capacidade = 100;

    public ArrayDinamico() {
        this.elementos = new String[capacidade];
        this.size = 0;
    }

    public void adicionar(String elemento) {
        if (size == elementos.length) {
            redimensionar();
        }
        elementos[size++] = elemento;
    }

    private void redimensionar() {
        String[] elementosNovos = new String[elementos.length * 2];
        System.arraycopy(elementos, 0, elementosNovos, 0, elementos.length);
        elementos = elementosNovos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elementos[i]).append(", ");
        }
        if (size > 0) {
            sb.append(elementos[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return size;
    }
}
