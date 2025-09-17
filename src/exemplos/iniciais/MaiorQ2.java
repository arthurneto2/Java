package exemplos.iniciais;

import java.util.Scanner;

public class MaiorQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro valor: ");

        double biggerValue = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double secondValue = scanner.nextDouble();

        if (secondValue > biggerValue){
            biggerValue = secondValue;
        }

        System.out.println("Digite o terceiro valor: ");
        double thirdValue = scanner.nextDouble();

        if (thirdValue > biggerValue){
            biggerValue = thirdValue;
        }

        System.out.println("O maior valor é: " + biggerValue);

    }

}
