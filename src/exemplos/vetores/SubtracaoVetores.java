package exemplos.vetores;

public class SubtracaoVetores {
    public static void main(String[] args) {
        int [] vetor1 = {10, 20, 30, 40, 50};
        int [] vetor2 = {1, 2, 3, 4, 5};
        int [] subtracao = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            subtracao[i] = vetor1[i] - vetor2[i];
        }

        for (int num : subtracao) {
            System.out.println(num);
        }
    }
}
