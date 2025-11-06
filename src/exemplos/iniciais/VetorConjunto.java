package exemplos.iniciais;

public class VetorConjunto {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[vetor1.length];
        int[] vetor3 = new int[vetor1.length * 2];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random() * 10);
            vetor2[i] = (int) (Math.random() * 10);
        }

        System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);

        System.arraycopy(vetor2, 0, vetor3, vetor1.length, vetor2.length);

        for (int numero : vetor1) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor A");

        for (int numero : vetor2) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor B");

        for (int numero : vetor3) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Conjunto");
    }
}
