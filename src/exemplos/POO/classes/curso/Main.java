package exemplos.POO.classes.curso;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criar professor
        Professor professor = new Professor("Dr. João Silva", "Ciência da Computação", "joao.silva@universidade.com");

        // Criar 5 alunos com suas notas
        Aluno aluno1 = new Aluno("Maria Santos", "2023001", new double[]{8.5, 9.0, 7.5, 8.0});
        Aluno aluno2 = new Aluno("Pedro Oliveira", "2023002", new double[]{6.0, 5.5, 7.0, 6.5});
        Aluno aluno3 = new Aluno("Ana Costa", "2023003", new double[]{9.5, 9.0, 10.0, 9.5});
        Aluno aluno4 = new Aluno("Lucas Ferreira", "2023004", new double[]{5.0, 6.0, 4.5, 5.5});
        Aluno aluno5 = new Aluno("Juliana Souza", "2023005", new double[]{7.5, 8.0, 7.0, 7.5});

        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5};

        // Criar curso
        Curso curso = new Curso("Programação Orientada a Objetos", LocalDateTime.now(), professor, alunos);

        // Mostrar informações do curso
        System.out.println("===== INFORMAÇÕES DO CURSO =====");
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Data de Início: " + curso.getDataInicio());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Departamento: " + professor.getDepartamento());
        System.out.println("Email: " + professor.getEmail());
        System.out.println();

        // Mostrar informações dos alunos
        System.out.println("===== INFORMAÇÕES DOS ALUNOS =====");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.printf("Média: %.2f%n", aluno.calcularMedia());
            System.out.println("Status: " + (aluno.isAprovado() ? "APROVADO" : "REPROVADO"));
            System.out.println();
        }

        // Mostrar média da turma
        System.out.println("===== MÉDIA DA TURMA =====");
        System.out.printf("Média Geral: %.2f%n", curso.calcularMediaTurma());
    }
}
