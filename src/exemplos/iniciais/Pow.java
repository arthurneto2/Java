package exemplos.iniciais;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o valor do expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

    }
}
