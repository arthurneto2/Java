package estruturasDeDados.estruturasEstaticas.fila;

import estruturasDeDados.interfaces.QueueInterface;

public class Main {
    public static void main(String[] args) {
        QueueInterface<Integer> fila = new Queue<>(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);

        System.out.println("Fila: " +  fila);
        System.out.println();

        int tamanho = fila.size();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Fila após dequeue: "  + fila);
        }

        Queue<Integer> pq = new PriorityQueue<>();

        pq.enqueue(1);
        pq.enqueue(3);
        pq.enqueue(4);
        pq.enqueue(2);
        pq.enqueue(0);

        System.out.println("\nFila de Prioridade: " + pq);
        System.out.println();


    }
}
