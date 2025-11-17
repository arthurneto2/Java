package exemplos.matriz;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];

        System.out.println("### JOGO DA VELHA ###");

        for (String[] strings : tabuleiro) {
            Arrays.fill(strings, "_");
        }

        printaTabuleiro(tabuleiro);

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

            if (!tabuleiro[x][y].equals("_")) {
                System.out.println("Posição já preenchida, vez do jogador " + (i % 2 == 0 ? "1" : "2") + " novamente");
                i--;
            } else {
                if (i % 2 == 0) {
                    tabuleiro[x][y] = "X";
                } else {
                    tabuleiro[x][y] = "O";
                }
            }

            printaTabuleiro(tabuleiro);

            if (verificaVitoria(tabuleiro)) {
                System.out.println("Vencedor: Jogador" + (i % 2 == 0 ? "1" : "2"));
                ganhador = true;
                break;
            }
        }

        if (!ganhador){
            System.out.println("VELHA!!!");
        }

    }

    public static void printaTabuleiro(String[][] matriz) {
        System.out.println();
        for (String[] linha : matriz) {
            for (String posicao : linha) {
                System.out.print(posicao + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean verificaVitoria(String[][] matriz) {
        for (String[] strings : matriz) {
            if (strings[0].equals("X") || strings[0].equals("O")) {
                if (strings[0].equals(strings[1]) && strings[0].equals(strings[2])) {
                    return true;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0][i].equals("X") || matriz[0][i].equals("O")) {
                if (matriz[0][i].equals(matriz[1][i]) && matriz[0][i].equals(matriz[2][i])) {
                    return true;
                }
            }
        }

        if (matriz[0][0].equals("X") || matriz[0][0].equals("O")){
            if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2])) {
                return true;
            }
        }

        if (matriz[0][2].equals("X") || matriz[0][2].equals("O")){
            return matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]);
        }
        return false;
    }
}
