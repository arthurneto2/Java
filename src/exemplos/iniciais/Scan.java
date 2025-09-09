package exemplos.iniciais;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = scan.nextInt();

        System.out.println("você digitou: " + num);

    }
}
