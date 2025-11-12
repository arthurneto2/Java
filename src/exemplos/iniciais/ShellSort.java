package exemplos.iniciais;

public class ShellSort {
    public static void main(String[] args) {
        int[] vetor = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};


        for (int numero : vetor) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Original");

        for (int gap = vetor.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < vetor.length; i++) {
                int j = i;
                int temp = vetor[i];

                while (j >= gap && vetor[j - gap] > temp) {
                    vetor[j] = vetor[j - gap];
                    j -= gap;
                }
                vetor[j] = temp;
            }
        }

        for (int numero : vetor) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Vetor Ordenado");
    }
}
