package estruturasDeDados.estruturasEstaticas.arrayList;
import estruturasDeDados.estruturasEstaticas.modelStatic.Static;

public class ArrayList<T> extends Static<T> {

    public ArrayList(int capacidade) { super(capacidade); }

    public ArrayList() {
        super(10);
    }

    public void add(T elemento) {
        super.add(elemento);
    }

    public void adicionar(int posicao, T elemento) {
        if (posicao < 0 || posicao > super.size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        if (super.size() == super.getArray().length) {
            super.resize();
        }
        for (int i = super.size(); i > posicao; i--) {
            super.getArray()[i] = super.getArray()[i - 1];
        }
        super.getArray()[posicao] = elemento;
        super.upSize();
        updateIndexLastElement();
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= super.size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        for (int i = posicao; i < super.size() - 1; i++) {
            super.getArray()[i] = super.getArray()[i + 1];
        }
        super.getArray()[super.size() - 1] = null; // evita memory leak
        downSize();
        updateIndexLastElement();
    }

    public void remover(T elemento) {
        int posicao = busca(elemento);
        if (posicao != -1) {
            remover(posicao);
        }
    }

    public int busca(T elemento) {
        for (int i = 0; i < size(); i++) {
            if (super.getArray()[i] == null) {
                if (elemento == null) return i;
            } else if (super.getArray()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T busca(int posicao) {
        if (posicao < 0 || posicao >= size()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return getArray()[posicao];
    }

    public boolean contem(T elemento) {
        return busca(elemento) != -1;
    }

    public int ultimoIndice(T elemento) {
        for (int i = size() - 1; i >= 0; i--) {
            if (getArray()[i] == null) {
                if (elemento == null) return i;
            } else if (getArray()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
