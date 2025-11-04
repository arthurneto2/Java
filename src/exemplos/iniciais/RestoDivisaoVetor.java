package exemplos.iniciais;

public class RestoDivisaoVetor {
    public static void main(String[] args) {
        double[] vetor = {10, 15, 30, 45, 50};
        double[] restoDivisao = new double[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            restoDivisao[i] = vetor[i] % 2;
        }

        for (double numero : restoDivisao) {
            System.out.println(numero);
        }
    }
}
