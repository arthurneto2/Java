package exemplos.vetores;

public class DivisaoVetores {
    public static void main(String[] args) {
        double[] vetor1 = {100, 200, 300, 400, 500};
        double [] vetor2 = {2, 4, 5, 10, 20};
        double[] divisao = new double[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            divisao[i] = vetor1[i] / vetor2[i];
        }

        for (double numero : divisao) {
            System.out.println(numero);
        }
    }
}
