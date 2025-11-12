package exemplos.vetores;

public class SomaElementos {
    public static void main(String[] args) {
        int [] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int numero : vetor) {
            soma += numero;
        }

        System.out.println("A soma dos elementos do vetor é : " + soma);

    }
}
