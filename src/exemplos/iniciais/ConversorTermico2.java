package exemplos.iniciais;

import java.util.Scanner;

public class ConversorTermico2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double farenheit = (celsius * 9 / 5  + 32);
        System.out.println(farenheit + " Farenheit");
    }
}
