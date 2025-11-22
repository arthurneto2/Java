package exemplos.POO.classes.escola;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.println("Digite a matricula do aluno: ");
        aluno.setMatricula(scanner.nextLine());

        System.out.println("Digite o curso do aluno:");
        aluno.setCurso(scanner.nextLine());

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.println("Digite o nome da disciplina " + (i+1) + ": ");
            aluno.getDisciplinas()[i] = scanner.nextLine();
            System.out.println("Digite a nota da disciplina " + (i+1) + ": ");
            aluno.getNotas()[i] = scanner.nextDouble();
        }

        for (double nota : aluno.notas){
            System.out.println("Nota: " + nota);
            System.out.println("Aprovado: " + aluno.aprovado(nota));
        }

    }
}
