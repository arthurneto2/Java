package exemplos.vetores;

public class VetorQuadratico {
    public static void main(String[] args) {
        int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int [] vetor2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i] * vetor1[i];
        }

        for (int numero : vetor2) {
            System.out.println(numero);
        }
    }
}
