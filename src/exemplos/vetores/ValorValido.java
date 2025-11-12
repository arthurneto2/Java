package exemplos.vetores;

import java.util.Scanner;

public class ValorValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite uma nota valida: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota >10){
                System.out.println("Nota invalida...");
            }
        }while (nota < 0 || nota >10);

    }
}
