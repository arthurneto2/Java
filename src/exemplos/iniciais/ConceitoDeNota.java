package exemplos.iniciais;

import java.util.Scanner;

public class ConceitoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;
        char conceito;

        if(media > 9 && media <= 10){
            conceito = 'A';
        } else if (media > 7.5 && media <= 9 ) {
            conceito = 'B';
        } else if (media > 6 && media <= 7.5) {
            conceito = 'C';
        } else if (media > 4 && media <= 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Notas: " + primeiraNota + " e " + segundaNota);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + conceito);

        switch (conceito){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("APROVADO!!!");
                break;
            case 'D':
            case 'E':
                System.out.println("REPROVADO!!!");
                break;
        }

    }
}
