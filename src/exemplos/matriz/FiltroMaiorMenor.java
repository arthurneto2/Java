package exemplos.matriz;

public class FiltroMaiorMenor {
    public static void main(String[] args) {
        int [][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] vetMat : matriz) {
            for (int numero : vetMat) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        int maiorLinha5 = matriz[5][0];
        int menorLinha5 = matriz[5][9];
        int maiorColuna7 = matriz[0][7];
        int menorColuna7 = matriz[9][7];

        for (int i = 0; i < matriz[5].length; i++) {
            if (matriz[5][i] > maiorLinha5) {
                maiorLinha5 = matriz[5][i];
            }
            if (matriz[5][i] < menorLinha5) {
                menorLinha5 = matriz[5][i];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][7] > maiorColuna7) {
                maiorColuna7 = matriz[i][7];
            }
            if (matriz[7][i] < menorColuna7) {
                menorColuna7 = matriz[i][7];
            }
        }

        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);
        System.out.println("Maior valor da coluna 7: " + maiorColuna7);
        System.out.println("Menor valor da coluna 7: " + menorColuna7);
    }
}
