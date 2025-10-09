package exemplos.iniciais;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidades de notas que deseja calcular: ");
        int quantidadeNotas = scanner.nextInt();
        int soma = 0;
        int nota;
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite a nota [" + (i+1) + "]:");
            nota = scanner.nextInt();
            soma += nota;
        }
        System.out.println("A media das notas são: " + (soma / quantidadeNotas));
    }
}
