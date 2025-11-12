package exemplos.vetores;

public class VetorDobrado {
    public static void main(String[] args) {

        int [] vetor1 = {1, 2, 3, 4, 5, 7, 8};
        int [] vetor2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i] * 2;
        }

        for (int numero : vetor2) {
            System.out.println(numero);
        }
    }
}
