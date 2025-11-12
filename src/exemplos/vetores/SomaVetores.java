package exemplos.vetores;

public class SomaVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {6, 7, 8, 9, 10};
        int[] soma = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        for (int numero : soma) {
            System.out.println(numero);
        }
    }
}
