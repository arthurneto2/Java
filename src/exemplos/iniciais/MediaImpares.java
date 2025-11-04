package exemplos.iniciais;

public class MediaImpares {
    public static void main(String[] args) {
        int[] vetor = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int quantidadeImpares = 0;
        double somaImpares = 0;

        for (int numero : vetor) {
            if (numero % 2 != 0) {
                quantidadeImpares++;
                somaImpares += numero;
            }
        }
        System.out.println("A media dos valores impares é: " + (somaImpares / quantidadeImpares));
    }
}
