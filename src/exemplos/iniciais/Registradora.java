package exemplos.iniciais;

import java.util.Scanner;

public class Registradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair;
        do {
            int i = 0;
            double valorProduto;
            double valorTotal = 0;
            System.out.println("### Lojar Tabajara ###");
            boolean encerrarCompra = true;
            do {
                System.out.println("Digite o valorTotal da mercadoria [" + (i + 1) + "] [0 - encerra a compra]: ");
                valorTotal += valorProduto = scanner.nextDouble();
                if (valorProduto == 0) {
                    encerrarCompra = false;
                } else {
                    i++;
                }
            }while (encerrarCompra);

            System.out.println("Valor total da compra: " + valorTotal);
            System.out.println("Digite o valorTotal pago pelo cliente:");
            double valorPago = scanner.nextDouble();
            System.out.println("Troco: " + (valorPago - valorTotal));

            System.out.println("Deseja sair do programa?[S/N]:");
            sair = !(scanner.next().equalsIgnoreCase("S"));
        }while (sair);
    }
}
