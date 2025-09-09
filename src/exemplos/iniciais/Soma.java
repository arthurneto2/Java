package exemplos.iniciais;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = scan.nextInt();

        System.out.println("A soma dos valores é: " + (num1+num2));

    }
}
