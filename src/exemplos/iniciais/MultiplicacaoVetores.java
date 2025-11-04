package exemplos.iniciais;

public class MultiplicacaoVetores {
    public static void main(String[] args) {
        int [] vetor1 = {1, 2, 3, 4, 5};
        int [] vetor2 = {6, 7, 8, 9, 10};
        int [] produto = new int[vetor1.length];

        for (int i = 0; i < produto.length; i++) {
            produto[i] = vetor1[i] * vetor2[i];
        }

        for (int numero : produto) {
            System.out.println(numero);
        }
    }
}
