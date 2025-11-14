package exemplos.matriz;

public class MaiorValor {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int maiorValor = matriz[0][0];
        int iMaior = 0;
        int jMaior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    iMaior = i;
                    jMaior = j;
                }
            }
        }
        System.out.println("Maior valor da matriz: " + maiorValor + " na posição (" + iMaior + ", " + jMaior + ")");

    }
}
