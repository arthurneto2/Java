package exemplos.matriz;

public class ParesImpares {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int quantPares = 0;
        int quantImpares = 0;


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

        for (int[] ints : matriz) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    quantPares++;
                } else {
                    quantImpares++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpares);
    }
}
