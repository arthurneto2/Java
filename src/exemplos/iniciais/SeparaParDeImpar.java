package exemplos.iniciais;

public class SeparaParDeImpar {
    public static void main(String[] args) {
        int[] vetorOriginal = new int[20];
        int[] vetorPar = new int[vetorOriginal.length];
        int[] vetorImpar = new int[vetorOriginal.length];

        int posicaoPar = 0;
        int posicaoImpar = 0;

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = (int) (Math.random() * 100);
        }

        for (int numero : vetorOriginal) {
            if (numero % 2 == 0) {
                vetorPar[posicaoPar] = numero;
                posicaoPar++;
            } else {
                vetorImpar[posicaoImpar] = numero;
                posicaoImpar++;
            }
        }

        for (int numero : vetorOriginal){
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Original");


        for (int numero : vetorPar){
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Par");


        for (int numero : vetorImpar){
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor impar");
    }
}
