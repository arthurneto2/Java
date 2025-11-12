package matriz;

public class MatrizInrregular {
    public static void main(String[] args) {
        int quantidadeIntrevistados = 3;
        String[][] nomesFilhos = new String[quantidadeIntrevistados][];

        // Aloca exatamente o tamanho necessário para cada entrevistado
        for (int i = 0; i < nomesFilhos.length; i++) {
            nomesFilhos[i] = new String[i + 1];
        }

        String[] nomes = {"Ana", "Bia", "Carlos", "Daniel", "Eduardo", "Fabio"};
        int indexNomes = 0;


        for (int i = 0; i < nomesFilhos.length; i++) {
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                nomesFilhos[i][j] = nomes[indexNomes];
                indexNomes++;
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entrevistado " + (i + 1) + ":");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("    " + nomesFilhos[i][j]);
            }
        }

    }
}
