package exemplos.iniciais;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavra;
        boolean palindromo = true;

        System.out.println("Digite a palavra para descobrir se é palíndromo: ");
        palavra = scanner.nextLine().toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo){System.out.println("A palavra é um palíndromo.");}
        else {System.out.println("A palavra não é um palíndromo.");}
    }
}
