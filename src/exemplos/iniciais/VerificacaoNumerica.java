package exemplos.iniciais;

import java.util.Scanner;

public class VerificacaoNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double value = scanner.nextDouble();
        System.out.println("Digite outro número: ");
        double secondValue = scanner.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - positivo ou negativo");
        System.out.println("2 - inteiro ou decimal");
        int operation = scanner.nextInt();

        if (operation == 1) {
            if (value >= 0) {
                System.out.println("O número " + value + " é positivo.");
            } else {
                System.out.println("O número " + value + " é negativo.");
            }
            if (secondValue >= 0) {
                System.out.println("O número " + secondValue + " é positivo.");
            } else {
                System.out.println("O número " + secondValue + " é negativo.");
            }
        } else if (operation == 2) {
            if (value % 1 == 0) {
                System.out.println("O número " + (int) value + " é inteiro.");
            } else {
                System.out.println("O número " + value + " é decimal.");
            }
            if (secondValue % 1 == 0) {
                System.out.println("O número " + (int) secondValue + " é inteiro.");
            } else {
                System.out.println("O número " + secondValue + " é decimal.");
            }
        } else {
            System.out.println("Operação inválida!");
        }
    }
}
