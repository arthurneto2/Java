package exemplos.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BatataQuente {
    public static void main(String[] args) {
        Queue<Integer> fila1 = new LinkedList<>();
        Queue<Integer> fila2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            fila1.add(i);
        }

        System.out.println("Jogadores" + fila1);

        while (fila1.size()>1 || fila2.size()>1) {
            passarBatata(fila1, fila2);
            passarBatata(fila2, fila1);
        }

        if(!fila1.isEmpty()) {
            System.out.println("Ganhador: " + fila1.remove());
        }
        if(!fila2.isEmpty()) {
            System.out.println("Ganhador: " + fila2.remove());
        }

    }

    private static void passarBatata(Queue<Integer> fila1, Queue<Integer> fila2) {
        int quantidade = fila1.size();
        for (int i = 0; i < quantidade; i++) {
            if (fila2.isEmpty() && fila1.size() == 1) {
                break;
            }
            if(statusBatata().equals("Quente")){
                Integer jogador = fila1.remove();
                System.out.println("Jogador " + jogador + " passou a batata quente para o próximo jogador.");
                fila2.add(jogador);
            }else{

                Integer jogador = fila1.remove();
                System.out.println("Jogador " + jogador + " queimou a batata quente e foi eliminado.");
            }
        }
    }

    public static String statusBatata(){
        String[] status = {"Quente", "Queimou"};
        return status[new Random().nextInt(2)];
    }

}
