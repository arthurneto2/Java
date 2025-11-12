package exemplos.vetores;

public class VetoresIguais {
    public static void main(String[] args) {
        int [] vetor1 = {1, 2, 3, 4, 5};
        int [] vetor2 = new int[vetor1.length];

        System.arraycopy(vetor1, 0, vetor2, 0, vetor1.length);

        for (int numero : vetor2) {
            System.out.println(numero);
        }
    }
}
