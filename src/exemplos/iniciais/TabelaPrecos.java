package exemplos.iniciais;
import java.util.Scanner;

public class TabelaPrecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor dos produtos: ");
        double valor = scanner.nextDouble();
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - " + "R$" + (valor * i));
        }

    }
}
