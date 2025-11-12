package exemplos.vetores;

public class SomaMultiplos {
    public static void main(String[] args) {
        int [] vetor = {10, 13, 20, 23, 30, 33, 40, 43};
        int soma = 0;

        for (int numero : vetor){
            if (numero % 5 == 0){
                soma += numero;
            }
        }

        System.out.println("A soma dos multiplos de 5 sao: " + soma);
    }
}
