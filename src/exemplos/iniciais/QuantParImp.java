package exemplos.iniciais;

import java.util.Scanner;

public class QuantParImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor " + (i+1) + ": ");
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de valores pares: " + par);
        System.out.println("Quantidade de valore impares: " + impar);
    }
}
