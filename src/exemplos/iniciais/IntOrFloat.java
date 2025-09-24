package exemplos.iniciais;

import java.util.Scanner;

public class IntOrFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double value = scanner.nextDouble();

        if (value % 1 == 0) {
            System.out.println("O número " + (int) value + " é inteiro.");
        } else {
            System.out.println("O número " + value + " é decimal.");
        }

    }
}
