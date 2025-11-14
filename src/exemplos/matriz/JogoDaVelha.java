package exemplos.matriz;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] matriz = new char[3][3];

        System.out.println("### JOGO DA VELHA ###");

        for (char[] linha : matriz) {
            for (char posicao : linha) {
                System.out.print(posicao + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0){
                System.out.println("Vez do jogador " + (i +1));
            }



        }
    }
}
