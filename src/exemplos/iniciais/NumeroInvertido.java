package exemplos.iniciais;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para gerar o seu numero invertido: ");
        String numero = scanner.nextLine();

        for (int i = numero.length(); i > 0; i--) {
            System.out.printf("%c",numero.charAt(i-1));
        }
    }
}
