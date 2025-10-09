package exemplos.iniciais;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada: ");
        int valor = scanner.nextInt();

        System.out.println("Tabuada de " + valor + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}
