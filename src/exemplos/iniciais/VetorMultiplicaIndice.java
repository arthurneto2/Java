package exemplos.iniciais;

public class VetorMultiplicaIndice {
    public static void main(String[] args) {

        int [] vetor = {1, 2, 3, 4, 5};
        int [] multiplicado = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            multiplicado[i] = vetor[i] * i;
        }

        for (int numero : multiplicado) {
            System.out.println(numero);
        }
    }
}
