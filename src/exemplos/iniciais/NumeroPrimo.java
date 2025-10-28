package exemplos.iniciais;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para gerear uma sequencia de numeros primos:");
        int numero = scanner.nextInt();
        int divisoesFeitas = 0;
        boolean primo;

        for (int i = 1; i <= numero; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                divisoesFeitas++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.printf("%d ",i);
            }
        }
        System.out.println("\nDivisoes feitas: " + divisoesFeitas);
    }
}
