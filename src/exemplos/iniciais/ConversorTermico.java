package exemplos.iniciais;

import java.util.Scanner;

public class ConversorTermico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digte a temperatura em Farenheit: ");
        double farenheit = scanner.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);

        System.out.printf("A temperatura em Celsius é: %.2f", celsius);
    }
}
