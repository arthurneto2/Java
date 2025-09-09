package exemplos.iniciais;

import java.util.Scanner;

public class OperacoesAritimeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        double firstInt = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        double secondInt = scanner.nextInt();

        System.out.println("Digite um valor real: ");
        double realValue = scanner.nextDouble();

        double casoA = (firstInt * 2) * (secondInt / 2);
        double casoB = firstInt * 3 + realValue;
        double casoC = realValue * realValue * realValue;

        System.out.println("\nCaso A: " + casoA);
        System.out.println("Caso B: " + casoB);
        System.out.println("Caso C: " + casoC);


    }
}
