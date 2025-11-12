package exemplos.vetores;

import java.util.Scanner;

public class MediaNotasVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] notas1 = new double[10];
        double [] notas2 = new double[notas1.length];
        double [] media = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite a primeira nota do aluno " + (i + 1) + ": ");
            notas1[i] = scan.nextDouble();
            System.out.println("Digite a segunda nota do aluno " + (i + 1) + ": ");
            notas2[i] = scan.nextDouble();
        }

        for (int i = 0; i < media.length; i++) {
            media[i] = (notas1[i] + notas2[i]) / 2;
        }

        for (int i = 0; i < media.length; i++) {
            if(media[i] >= 7){
                System.out.println("Aluno " + (i + 1) + " aprovado com média: " + media[i]);
            }else {
                System.out.println("Aluno " + (i + 1) + " reprovado com média: " + media[i]);
            }

        }
    }
}
