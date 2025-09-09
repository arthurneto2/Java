package exemplos.iniciais;

import java.util.Scanner;

public class Balanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de peixe pescada [KG]: ");
        double pesoPescado = scanner.nextDouble();

        double excesso = 0, multa;

        if(pesoPescado > 50){
            excesso = pesoPescado - 50;
        }

        multa = 4 * excesso;
        System.out.println("A multa a ser paga é: " + multa + " reais");

    }
}
