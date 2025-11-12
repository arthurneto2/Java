package exemplos.vetores;

public class CodigoTrinario {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorBinario = new int[vetorA.length];


        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] > vetorB[i]){
                vetorBinario[i] = 1;
            }else if (vetorA[i] == vetorB[i]){
                vetorBinario[i] = 0;
            }else {
                vetorBinario[i] = -1;
            }
        }

        for (int numero : vetorA) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor A");

        for (int numero : vetorB) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor B");

        for (int numero : vetorBinario) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Binario");
    }
}
