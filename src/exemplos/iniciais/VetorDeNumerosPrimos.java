package exemplos.iniciais;

public class VetorDeNumerosPrimos {
    public static void main(String[] args) {
        int[] vetorComPrimos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numero : vetorComPrimos) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Original");


        for (int vetorComPrimo : vetorComPrimos) {
            boolean primo = true;
            for (int j = 2; j < vetorComPrimo; j++) {
                if (vetorComPrimo % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(vetorComPrimo + " -> ");
            }
        }
        System.out.println("Vetor com Primos");

    }
}
