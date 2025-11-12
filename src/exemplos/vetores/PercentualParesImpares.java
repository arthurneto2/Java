package exemplos.vetores;

public class PercentualParesImpares {
    public static void main(String[] args) {
        int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int quantPares = 0;
        int quantImpares = 0;

        for (int numero : vetor1) {
            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
        }

        int percentualPares = quantPares * 100 / vetor1.length;
        int percentualImpares = quantImpares * 100 / vetor1.length;

        System.out.println("Percentual de pares: " + percentualPares + "%");
        System.out.println("Percentual de impares: " + percentualImpares + "%");
    }
}
