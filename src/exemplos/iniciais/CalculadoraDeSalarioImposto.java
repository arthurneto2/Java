package exemplos.iniciais;

import java.util.Scanner;

public class CalculadoraDeSalarioImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioMes = salarioHora * horasTrabalhadas;
        System.out.println("Você ganhou esse mês: " + salarioMes);

        double salarioBruto = salarioMes;

        salarioMes -= (salarioMes/100 * 11);
        System.out.println("Valor pago de INSS: " + (salarioBruto - salarioMes));

        double temp = salarioMes;

        salarioMes -= salarioMes/100 * 8;
        System.out.println("Valor pago de sindicato: " + (temp - salarioMes));

        temp -= salarioMes;

        salarioMes -= salarioMes/100 * 5;
        System.out.println("Valor pago de : " + (salarioMes - temp));

        System.out.println("Salario liquido: R$" + salarioMes);
    }
}
