package exemplos.iniciais;

import java.util.Scanner;

public class TempoDowload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB que será feito o dowload: ");
        double tamArquivo = scanner.nextInt();

        System.out.println("Digite a velociade da sua internete em MBs: ");
        double velocidadeDowload = scanner.nextInt();

        System.out.println("Seu dowload irá demorar: " + (tamArquivo / velocidadeDowload) + "s");
    }
}
