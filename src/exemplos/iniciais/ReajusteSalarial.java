package exemplos.iniciais;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario:");
        double salario = scanner.nextDouble();
        double aumento;
        int porcentagemAumento;

        if (salario <= 280){
            porcentagemAumento = 20;
        } else if (salario <= 700) {
            porcentagemAumento = 15;
        } else if (salario <= 1500) {
            porcentagemAumento = 10;
        }else {
            porcentagemAumento = 5;
        }

        aumento = salario/100 * porcentagemAumento;

        System.out.println("Salario antes do reajuste: R$" + salario);
        System.out.println("Porcentagem do aumento: %" + porcentagemAumento);
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salario atualizado: R$" + (salario + aumento));
    }
}
