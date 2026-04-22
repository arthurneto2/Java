package estruturasDeDados.estruturasEstaticas.pilha;

import estruturasDeDados.estruturasEstaticas.modelStatic.Static;

public class Stack<T> extends Static<T> {
    private int topo;

    public Stack(int capacidade) {
        super(capacidade);
        this.topo = -1;
    }

    public Stack() {
        super(10);
        this.topo = -1;
    }


    public void push(T elemento) {
        super.adicionar(elemento);
        topo++;
    }


    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        T elemento = getArray()[topo];
        getArray()[topo--] = null; // evita memory leak
        downSize();
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vazia");
        }
        return getArray()[topo];
    }
}
