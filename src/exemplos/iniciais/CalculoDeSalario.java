package exemplos.iniciais;

import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioMes = salarioHora * horasTrabalhadas;
        System.out.println("Você ganhou esse mês: " + salarioMes);
    }
}
