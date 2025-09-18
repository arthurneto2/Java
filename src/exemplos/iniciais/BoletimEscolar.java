package exemplos.iniciais;

import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextInt();

        double mediaAluno = (nota1 + nota2) / 2;

        if (mediaAluno == 10){
            System.out.println("Aprovado com Distinção...");
        } else if (mediaAluno > 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}

