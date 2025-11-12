package exemplos.vetores;

public class TabelaTabuada {
    public static void main(String[] args) {

        int[] vetorTabuado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i <= vetorTabuado.length; i++) {
            System.out.print("Tabuada de " + i + "      ");
        }

        System.out.println();
        for (int i = 1; i <= vetorTabuado.length ; i++) {
            for (int numero : vetorTabuado){
                System.out.print(numero + " x " + i + " = " + numero * i + "        ");
            }
            System.out.println();
        }

    }
}
