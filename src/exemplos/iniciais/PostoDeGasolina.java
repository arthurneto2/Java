package exemplos.iniciais;

import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().trim().charAt(0);
        double precoLitro = 0;
        double desconto = 0;
        double valorTotal = 0;

        if (tipoCombustivel == 'A') {
            precoLitro = 1.90;
            if (litrosVendidos <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel == 'G') {
            precoLitro = 2.50;
            if (litrosVendidos <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        System.out.println("Preço por litro: R$ " + precoLitro);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        valorTotal = litrosVendidos * (precoLitro - (precoLitro * desconto));
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);
    }
}
