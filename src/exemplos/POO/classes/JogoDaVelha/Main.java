package exemplos.POO.classes.JogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("### JOGO DA VELHA ###");

        jogo.printaTabuleiro();

        boolean ganhador = false;

        for (int i = 0; i < 9; i++) {

            System.out.println("Vez do jogador " + (i % 2 == 0 ? "1" : "2"));
            int x;
            do {
                System.out.println("digite o valor de X da cordenada que deseja preencher [0, 1, 2]: ");
                x = scanner.nextInt();
            }while (x < 0 || x > 3);

            int y;
            do {
                System.out.println("digite o valor de Y da cordenada que deseja preencher [0, 1, 2]: ");
                y = scanner.nextInt();
            }while (y < 0 || y > 3);

            if (!jogo.tabuleiro[x][y].equals("_")) {
                System.out.println("Posição já preenchida, vez do jogador " + (i % 2 == 0 ? "1" : "2") + " novamente");
                i--;
            } else {
                if (i % 2 == 0) {
                    jogo.jogadaJogador1(x, y);
                } else {
                    jogo.jogadaJogador2(x, y);
                }
            }

            jogo.printaTabuleiro();

            if (jogo.verificaVitoria()) {
                System.out.println("Vencedor: Jogador" + (i % 2 == 0 ? "1" : "2"));
                ganhador = true;
                break;
            }
        }

        if (!ganhador){
            System.out.println("VELHA!!!");
        }
    }
}
