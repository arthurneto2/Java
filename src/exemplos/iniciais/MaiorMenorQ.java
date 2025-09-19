package exemplos.iniciais;

import java.util.Scanner;

public class MaiorMenorQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double firstValue = scanner.nextDouble();
        double biggerValue = firstValue;
        double smallerValue = firstValue;

        System.out.println("Digite o segundo valor: ");
        double secondValue = scanner.nextDouble();
        if (secondValue > biggerValue){
            biggerValue = secondValue;
        }
        if (secondValue < smallerValue){
            smallerValue = secondValue;
        }


        System.out.println("Digite o tereceiro valor: ");
        double thirdValue = scanner.nextDouble();
        if (thirdValue > biggerValue){
            biggerValue = thirdValue;
        }
        if (thirdValue < smallerValue){
            smallerValue = thirdValue;
        }

        System.out.println("O maior valor digitado é: " + biggerValue);
        System.out.println("O menor valor digitado é: " + smallerValue);

    }
}
