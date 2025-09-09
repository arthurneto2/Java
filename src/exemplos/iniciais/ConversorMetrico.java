package exemplos.iniciais;

import java.util.Scanner;

public class ConversorMetrico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = scan.nextDouble();

        System.out.println("O valor em centímetros é: " + metros * 100 + "cm");
    }
}
