package exemplos.iniciais;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para gerear uma sequencia de numeros primos:");
        int numero = scanner.nextInt();
        int quantDivisores;
        int divisoesFeitas = 0;

        for (int i = 1; i <= numero; i++) {
            quantDivisores = 0;
            for (int j = 1; j <= i; j++) {
                divisoesFeitas++;
                if (i % j == 0) {
                    quantDivisores++;
                }
            }
            if (quantDivisores <= 2){
                System.out.printf("%d ",i);
            }
        }
        System.out.println("\nDivisoes feitas: " + divisoesFeitas);

    }
}
