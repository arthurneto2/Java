package exemplos.iniciais;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scan.nextInt();

        System.out.println("Digite a quarta nota: ");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);
    }
}
