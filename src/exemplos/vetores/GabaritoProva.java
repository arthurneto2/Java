package exemplos.vetores;

import java.util.Scanner;

public class GabaritoProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[10];
        char[] respostas = new char[10];
        int acertos = 0;
        int maiorAcertos = 0;
        int totalAlunos = 0;
        double mediaNotas = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a resposta correta da questão " + (i + 1) + ":");
            gabarito[i] = scanner.next().toUpperCase().charAt(0);
        }
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite a resposta do aluno " + (totalAlunos + 1) + ":");
                respostas[i] = scanner.next().toUpperCase().charAt(0);
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }
            if (totalAlunos == 0 || acertos > maiorAcertos) {
                maiorAcertos = acertos;
            }
            totalAlunos++;
            mediaNotas += acertos;
            System.out.println("O aluno acertou " + acertos + " questões.");
            acertos = 0;
            System.out.println("Deseja continuar? (S/N)");
        }while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("O maior número de acertos foi: " + maiorAcertos);
        System.out.println("A média de acertos da turma foi: " + (mediaNotas / totalAlunos));
        scanner.close();
    }
}
