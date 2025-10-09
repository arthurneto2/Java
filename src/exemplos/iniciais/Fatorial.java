package exemplos.iniciais;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();
        int resultado = n;

        System.out.printf("%d! = ", n);
        for (int i = n; i > 1; i--) {
            System.out.printf("%d.", i);
            resultado *= (i-1);
        }
        System.out.println(1 + " = " + resultado);
    }
}
