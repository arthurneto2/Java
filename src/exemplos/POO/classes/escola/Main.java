package exemplos.POO.classes.escola;


public class Main {
    public static void main(String[] args) {
        // Criar 3 alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Silva");
        aluno1.setMatricula("2023001");
        aluno1.setCurso("Engenharia");
        aluno1.setDisciplinas(new String[]{"Matemática", "Física", "Programação"});
        aluno1.setNotas(new double[][]{
                {8.5, 7.0, 9.0},  // Matemática
                {6.0, 5.5, 7.0},  // Física
                {9.0, 8.5, 9.5}   // Programação
        });

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria Santos");
        aluno2.setMatricula("2023002");
        aluno2.setCurso("Ciência da Computação");
        aluno2.setDisciplinas(new String[]{"Algoritmos", "Banco de Dados", "Redes"});
        aluno2.setNotas(new double[][]{
                {5.0, 6.0, 5.5},  // Algoritmos
                {7.5, 8.0, 7.0},  // Banco de Dados
                {4.0, 5.0, 4.5}   // Redes
        });

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Pedro Oliveira");
        aluno3.setMatricula("2023003");
        aluno3.setCurso("Sistemas de Informação");
        aluno3.setDisciplinas(new String[]{"Estrutura de Dados", "Engenharia de Software", "Web"});
        aluno3.setNotas(new double[][]{
                {9.0, 9.5, 10.0}, // Estrutura de Dados
                {8.0, 8.5, 8.0},  // Engenharia de Software
                {7.0, 7.5, 8.0}   // Web
        });

        // Definir a nota mínima para aprovação
        int notaMinima = 7;

        // Array com todos os alunos
        Aluno[] alunos = {aluno1, aluno2, aluno3};

        // Exibir resultados
        System.out.println("=== RESULTADOS DOS ALUNOS ===\n");

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Disciplinas:");

            for (int i = 0; i < aluno.getDisciplinas().length; i++) {
                String status = aluno.verificaAprovacao(i, notaMinima) ? "APROVADO" : "REPROVADO";

                // Calcular média para exibição
                double media = aluno.calculaMedia(i);

                System.out.printf("  - %s: Média %.2f - %s%n",
                        aluno.getDisciplinas()[i], media, status);
            }
            System.out.println();
        }
    }
}
