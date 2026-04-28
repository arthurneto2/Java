package exemplos.stack;

import estruturasDeDados.estruturasEstaticas.pilha.Stack;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            String palavra = scanner.nextLine();

            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }

            // Limpa a pilha para a nova palavra
            while (!pilha.isEmpty()) {
                pilha.pop();
            }

            // Adiciona os caracteres da palavra na pilha
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            // Verifica se a palavra é um palíndromo
            boolean isPalindromo = true;
            for (char c : palavra.toCharArray()) {
                if (c != pilha.pop()) {
                    isPalindromo = false;
                    break;
                }
            }

            if (isPalindromo) {
                System.out.println("'" + palavra + "' é um palíndromo.");
            } else {
                System.out.println("'" + palavra + "' não é um palíndromo.");
            }

        }while(true);

    }
}
