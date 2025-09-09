package exemplos.iniciais;

import java.util.Scanner;

public class DobroDaAreaDoQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        double dobroDaArea = Math.pow(ladoQuadrado, 2) * 2;

        System.out.println("O dobro da área do seu quadrado é: " + dobroDaArea);


    }
}
