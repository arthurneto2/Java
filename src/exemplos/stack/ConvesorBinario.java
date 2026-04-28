package exemplos.stack;

import java.util.Scanner;
import java.util.Stack;

public class ConvesorBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();
        String numeroBinario = converterParaBinario(numeroDecimal);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número binário: " + numeroBinario);
    }

    private static String converterParaBinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        Stack<Integer> pilha = new Stack<>();
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            pilha.push(resto); // Adiciona o bit no início da string
            numeroDecimal /= 2; // Divide o número por 2 para obter o próximo bit
        }

        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()) {
            binario.append(pilha.pop()); // Remove o bit do topo da pilha e adiciona à string binária
        }
        return binario.toString();
    }
}
