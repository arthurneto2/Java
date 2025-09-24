package exemplos.iniciais;

import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs: ");
        double quantidadeMacas = scanner.nextDouble();

        System.out.println("Digite a quantidade de morangos: ");
        double quantidadeMorangos = scanner.nextDouble();

        double precoTotal = getPrecoTotal(quantidadeMacas, quantidadeMorangos);
        double quantidadeKgTotal = quantidadeMacas + quantidadeMorangos;

        if (quantidadeKgTotal > 8 || precoTotal > 25){
            precoTotal = precoTotal * 0.90;
        }

        System.out.printf("O preço total a pagar é: R$ %.2f%n", precoTotal);
    }

    private static double getPrecoTotal(double quantidadeMacas, double quantidadeMorangos) {
        double precoKgMacas;
        double precoKgMorangos;

        if (quantidadeMacas > 5){
            precoKgMacas = 1.50;
        }else {
            precoKgMacas = 1.80;
        }

        if (quantidadeMorangos > 5){
            precoKgMorangos = 2.20;
        }else {
            precoKgMorangos = 2.50;
        }

        double precoTotalMacas = quantidadeMacas * precoKgMacas;
        double precoTotalMorangos = quantidadeMorangos * precoKgMorangos;
        return precoTotalMacas + precoTotalMorangos;
    }
}
