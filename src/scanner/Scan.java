package scanner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a sua Idade: ");
        int idade = Integer.parseInt(scan.nextLine());

        System.out.println("Digite a sua altura: ");
        double altura = Double.parseDouble(scan.nextLine());

        System.out.println("\nolá " + nome + "...");
        System.out.println("sua idade é: " + idade);
        System.out.println("sua altura é: " + altura);
    }
}
