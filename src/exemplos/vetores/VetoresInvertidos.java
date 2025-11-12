package exemplos.vetores;

public class VetoresInvertidos {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random() * 10);
        }

        for (int i = vetor1.length - 1; i >= 0; i--) {
            vetor2[vetor1.length - 1 - i] = vetor1[i];
        }

        for (int numero : vetor1) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Original");

        for (int numero : vetor2) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Invertido");
    }

}
