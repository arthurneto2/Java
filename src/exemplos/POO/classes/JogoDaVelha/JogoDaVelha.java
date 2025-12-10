package exemplos.POO.classes.JogoDaVelha;

import java.util.Arrays;

public class JogoDaVelha {
    String[][] tabuleiro = new String[3][3];

    public JogoDaVelha() {
        for (String[] strings : tabuleiro) {
            Arrays.fill(strings, "_");
        }
    }

    public void printaTabuleiro() {
        for (String[] linha : tabuleiro) {
            for (String posicao : linha) {
                System.out.print(posicao + " ");
            }
            System.out.println();
        }
    }

    boolean posicaoValida(int linha, int coluna) {
        return tabuleiro[linha][coluna].equals("_");
    }

    public void jogadaJogador1(int linha, int coluna) {
        tabuleiro[linha][coluna] = "X";
    }

    public void jogadaJogador2(int linha, int coluna) {
        tabuleiro[linha][coluna] = "O";
    }

    public boolean verificaVitoria() {
        for (String[] strings : this.tabuleiro) {
            if (strings[0].equals("X") || strings[0].equals("O")) {
                if (strings[0].equals(strings[1]) && strings[0].equals(strings[2])) {
                    return true;
                }
            }
        }

        for (int i = 0; i < this.tabuleiro.length; i++) {
            if (this.tabuleiro[0][i].equals("X") || this.tabuleiro[0][i].equals("O")) {
                if (this.tabuleiro[0][i].equals(this.tabuleiro[1][i]) && this.tabuleiro[0][i].equals(this.tabuleiro[2][i])) {
                    return true;
                }
            }
        }

        if (this.tabuleiro[0][0].equals("X") || this.tabuleiro[0][0].equals("O")){
            if (this.tabuleiro[0][0].equals(this.tabuleiro[1][1]) && this.tabuleiro[0][0].equals(this.tabuleiro[2][2])) {
                return true;
            }
        }

        if (this.tabuleiro[0][2].equals("X") || this.tabuleiro[0][2].equals("O")){
            return this.tabuleiro[0][2].equals(this.tabuleiro[1][1]) && this.tabuleiro[0][2].equals(this.tabuleiro[2][0]);
        }
        return false;
    }


}
