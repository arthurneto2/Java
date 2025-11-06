package exemplos.iniciais;

public class CodigoBinario {
    public static void main(String[] args) {
        int [] vetor = new int[10];
        int [] vetorBinario = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                vetorBinario[i] = 1;
            }else {
                vetorBinario[i] = 0;
            }
        }

        for (int numero : vetor) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Inicial");

        for (int numero : vetorBinario) {
            System.out.print(numero +  " -> ");
        }
        System.out.println("Vetor Binario");



    }
}
