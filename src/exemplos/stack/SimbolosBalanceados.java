package exemplos.stack;

import estruturasDeDados.estruturasEstaticas.pilha.Stack;

import java.util.Scanner;

public class SimbolosBalanceados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão com parênteses: ");
        String expressao = scanner.nextLine();
        boolean balanceada = verificarBalanceamento(expressao);
        System.out.println("Expressão: " + expressao);
        System.out.println("Balanceada: " + balanceada);

    }

    private static boolean verificarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // Encontrou um ')' sem um '(' correspondente
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty(); // Se a pilha estiver vazia, os parênteses estão balanceados
    }
}