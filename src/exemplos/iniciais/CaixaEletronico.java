package exemplos.iniciais;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("### Caixa Eletrônico ###");
        System.out.println("Digite o valor que deseja sacar : ");
        System.out.println("(Valor min R$ 10,00 e valor max R$ 600,00)");
        int valorSaque = scanner.nextInt();
        if (valorSaque < 10 || valorSaque > 600){
            System.out.println("Valor inválido para saque!");
            return;
        }

        int notasCem = valorSaque / 100;
        int notasCinquenta = (valorSaque % 100) / 50;
        int notasDez = ((valorSaque % 100) % 50) / 10;
        int notasCinco = (((valorSaque % 100) % 50) % 10) / 5;
        int notasUm = ((((valorSaque % 100) % 50) % 10) % 5);

        System.out.println("Você receberá as seguintes notas: ");
        System.out.println(notasCem + " notas de R$ 100,00" );
        System.out.println(notasCinquenta + " notas de R$ 50,00" );
        System.out.println(notasDez + " notas de R$ 10,00" );
        System.out.println(notasCinco + " notas de R$ 05,00" );
        System.out.println(notasUm + " notas de R$ 01,00" );
    }
}
