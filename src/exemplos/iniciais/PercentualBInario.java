package exemplos.iniciais;

public class PercentualBInario {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        double contZero = 0;
        double contUm = 0;

        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) Math.round(Math.random());
        }

        for (int numero : vetor) {
            System.out.print(numero + " -> ");
            if (numero == 0){contZero++;}
            else {contUm++;}
        }
        System.out.println("FIM");
        System.out.println("O percentual de Zeros são: " + (contZero * 100 / vetor.length) + "%");
        System.out.println("O percentual de Uns são : " + (contUm * 100 / vetor.length) + "%");
    }
}
