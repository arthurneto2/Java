package exemplos.iniciais;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;

        System.out.println("Digite o primeiro valor: ");
        int maiorValor = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int medioValor = scanner.nextInt();
        if (medioValor > maiorValor){
            temp = maiorValor;
            maiorValor = medioValor;
            medioValor = temp;
        }

        System.out.println("Digite o terceiro valor: ");
        int menorValor = scanner.nextInt();

        if (menorValor > maiorValor){
            temp = maiorValor;
            maiorValor = menorValor;
            menorValor = medioValor;
            medioValor = temp;
        } else if (menorValor > medioValor){
            temp = medioValor;
            medioValor = menorValor;
            menorValor = temp;
        }

        System.out.println("[" + maiorValor + "|" + medioValor + "|" + menorValor + "]");


    }
}
