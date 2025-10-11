package exemplos.iniciais;

import java.util.Scanner;

public class AumentoAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que foi contratado: ");
        int anoContratado = scanner.nextInt();
        int anoAtual = 2025;
        double aumento = 1.5/100;
        System.out.println("Digite o salario inicial: ");
        double salario = scanner.nextDouble();

        for (int i = anoContratado + 1; i <= anoAtual ; i++) {
            salario += salario * aumento;
            aumento *= 2;
        }

        System.out.println("O salario atual é de: " + salario);
    }
}
