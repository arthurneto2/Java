package exemplos.iniciais;

import java.util.Scanner;

public class CalculoJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da divida: ");
        double divida = scanner.nextDouble();
        int juros = 0;
        double valorJuros = 0;

        System.out.println("Valor da Divida    Valor do Juros    Quantidade de Parcelas    Valor da Parcela");
        System.out.println("R$" + divida + "                    R$" + valorJuros + "                    " + 1 +
                "                    R$" + (divida));

        for (int i = 3; i <= 12 ; i += 3) {
            if (i == 3) {
                juros += 10;
            } else {
                juros += 5;
            }
            valorJuros = divida * juros / 100;
            divida += valorJuros;

            System.out.println("R$" + divida + "                    R$" + valorJuros + "                    " + i +
                        "                    R$" + (divida / i));

            divida -= valorJuros;
        }
    }
}
