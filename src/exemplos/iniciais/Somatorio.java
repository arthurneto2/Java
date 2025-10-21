package exemplos.iniciais;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de termo que deseja somar: ");
        int quantidadeTermo = scanner.nextInt();
        double soma = 0;
        double numerador = 1;
        double denominador = 1;

        System.out.print("Soma: ");
        for (int i = 0; i < quantidadeTermo -1; i++) {
            System.out.printf("%.0f/%.0f + ", numerador, denominador);
            soma += numerador / denominador;
            numerador++;
            denominador += 2;
        }
        System.out.printf("%.0f/%.0f = ", numerador, denominador);
        System.out.printf("%.2f", soma);
    }
}
