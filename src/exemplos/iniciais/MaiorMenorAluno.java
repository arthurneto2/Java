package exemplos.iniciais;

import java.util.Scanner;

public class MaiorMenorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codAluno;
        double altura;
        int codMaiorAluno = 0;
        double maiorAltura = 0;
        int codMenorAluno = 0;
        double menorAltura = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o código do aluno: ");
            codAluno = scanner.nextInt();
            System.out.println("Digite a altura do aluno (em metros): ");
            altura = scanner.nextDouble();
            if (i == 0) {
                maiorAltura = altura;
                menorAltura = altura;
                codMaiorAluno = codAluno;
                codMenorAluno = codAluno;
            } else {
                if (altura >= maiorAltura) {
                    maiorAltura = altura;
                    codMaiorAluno = codAluno;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    codMenorAluno = codAluno;
                }
            }
        }

        System.out.println("O aluno mais alto é o de código " + codMaiorAluno + " com " + maiorAltura + " metros.");
        System.out.println("O aluno mais baixo é o de código " + codMenorAluno + " com " + menorAltura + " metros.");

    }
}
