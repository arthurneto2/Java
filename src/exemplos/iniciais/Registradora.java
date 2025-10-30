package exemplos.iniciais;

import java.util.Scanner;

public class Registradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            int i = 0;
            double valorProduto;
            double valorTotal = 0;
            StringBuilder cupomFiscal = new StringBuilder();
            System.out.println("### Lojar Tabajara ###");

            do {
                System.out.println("Digite o valorTotal da mercadoria [" + (i + 1) + "] [0 - encerra a compra]: ");
                valorTotal += valorProduto = scanner.nextDouble();
                if (valorProduto == 0){break;}
                i++;
                cupomFiscal.append("Produto ").append(i).append(" - R$").append(valorProduto).append("\n");
            }while (true);

            cupomFiscal.append("Valor total da compra: ").append(valorTotal);
            System.out.println("Cupom fiscal: \n" + cupomFiscal);

            System.out.println("Digite o valorTotal pago pelo cliente:");
            double valorPago = scanner.nextDouble();
            System.out.println("troco: " + (valorPago - valorTotal));

            System.out.println("Deseja sair do programa?[S/N]:");
        }while (!(scanner.next().equalsIgnoreCase("S")));
    }
}
