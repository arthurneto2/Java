package exemplos.iniciais;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            soma += scanner.nextInt();
        }
        System.out.println("A soma dos valores são: " + soma);
        System.out.println("A media dos valores é: " + (soma / quantidadeNotas));
    }
}
