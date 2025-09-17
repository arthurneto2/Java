package exemplos.iniciais;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quanto custa sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIr;

        if(salarioBruto <= 900){
            descontoIr =  0;
        } else if (salarioBruto <= 1500) {
            descontoIr = 5;
        } else if (salarioBruto <= 2500) {
            descontoIr = 10;
        }else {
            descontoIr = 20;
        }

        double ir = salarioBruto /100 * descontoIr;
        double inss = salarioBruto / 100 * 10;
        double fgts = salarioBruto / 100 * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horasTrabalhadas + "): R$" + salarioBruto);
        System.out.println("(-) IR " + "(" + descontoIr + "%): R$" + ir);
        System.out.println("(-) INSS " + "(" + 10 + "%): R$" + inss);
        System.out.println("FGTS: " + "(" + 11 + "%): R$" + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}
