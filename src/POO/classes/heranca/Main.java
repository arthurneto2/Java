package POO.classes.heranca;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE HERANÇA E POLIMORFISMO ===\n");

        // ===== 1. OBJETOS QUE NÃO PODEM SER INSTANCIADOS =====
        System.out.println("1. Tentativa de instanciar Pessoa (CLASSE ABSTRATA):");
        System.out.println("   // Pessoa pessoa = new Pessoa(\"João\", \"Rua A\", \"123\"); // ERRO DE COMPILAÇÃO!");
        System.out.println("   Pessoa é abstrata e não pode ser instanciada diretamente.\n");

        // ===== 2. OBJETOS QUE PODEM SER INSTANCIADOS =====
        System.out.println("2. Instanciando Aluno e Professor:\n");

        Aluno aluno1 = new Aluno("Maria Silva", "Rua das Flores, 123", "111.222.333-44", "2024001", "Ciência da Computação");
        Professor professor1 = new Professor("Dr. João Santos", "Av. Principal, 456", "555.666.777-88", "Computação", "Doutorado");

        System.out.println("   Aluno criado: " + aluno1.getNome());
        System.out.println("   Professor criado: " + professor1.getNome() + "\n");

        // ===== 3. POLIMORFISMO - REFERÊNCIA DO TIPO PAI =====
        System.out.println("3. Polimorfismo - Referências do tipo Pessoa:\n");

        Pessoa pessoaAluno = new Aluno("Carlos Oliveira", "Rua B, 789", "222.333.444-55", "2024002", "Engenharia");
        Pessoa pessoaProfessor = new Professor("Dra. Ana Costa", "Av. Secundária, 321", "666.777.888-99", "Matemática", "Mestrado");

        System.out.println("   pessoaAluno referencia: " + pessoaAluno.getClass().getSimpleName());
        System.out.println("   pessoaProfessor referencia: " + pessoaProfessor.getClass().getSimpleName() + "\n");

        // ===== 4. POLIMORFISMO - MÉTODO saudacao() =====
        System.out.println("4. Polimorfismo em ação com método saudacao():\n");

        System.out.println("   aluno1.saudacao(): " + aluno1.saudacao());
        System.out.println("   professor1.saudacao(): " + professor1.saudacao());
        System.out.println("   pessoaAluno.saudacao(): " + pessoaAluno.saudacao());
        System.out.println("   pessoaProfessor.saudacao(): " + pessoaProfessor.saudacao() + "\n");

        // ===== 5. ACESSO A ATRIBUTOS - PUBLIC (nome) =====
        System.out.println("5. Acesso a atributo PUBLIC (nome):\n");

        System.out.println("   aluno1.nome (acesso direto): " + aluno1.nome);
        System.out.println("   professor1.nome (acesso direto): " + professor1.nome);
        aluno1.nome = "Maria Silva Souza";
        System.out.println("   aluno1.nome após modificação: " + aluno1.nome + "\n");

        // ===== 6. ACESSO A ATRIBUTOS - PROTECTED (endereco) =====
        System.out.println("6. Acesso a atributo PROTECTED (endereco):\n");

        System.out.println("   aluno1.endereco (acesso direto na subclasse): " + aluno1.endereco);
        System.out.println("   professor1.endereco (acesso direto na subclasse): " + professor1.endereco);
        System.out.println("   Acessível dentro do mesmo pacote e por herança.\n");

        // ===== 7. ACESSO A ATRIBUTOS - PRIVATE (cpf) =====
        System.out.println("7. Acesso a atributo PRIVATE (cpf):\n");

        System.out.println("   // aluno1.cpf // ERRO DE COMPILAÇÃO!");
        System.out.println("   CPF só acessível via getter: " + aluno1.getCpf());
        aluno1.setCpf("111.222.333-45");
        System.out.println("   CPF após modificação via setter: " + aluno1.getCpf() + "\n");

        // ===== 8. ACESSO A ATRIBUTOS ESPECÍFICOS DAS SUBCLASSES =====
        System.out.println("8. Acesso a atributos específicos das subclasses:\n");

        System.out.println("   aluno1.matricula: " + aluno1.matricula);
        System.out.println("   aluno1.curso: " + aluno1.curso);
        System.out.println("   professor1.departamento: " + professor1.departamento);
        System.out.println("   professor1.titulacao: " + professor1.titulacao + "\n");

        // ===== 9. LIMITAÇÕES DO POLIMORFISMO =====
        System.out.println("9. Limitações do polimorfismo:\n");

        System.out.println("   // pessoaAluno.matricula // ERRO DE COMPILAÇÃO!");
        System.out.println("   // pessoaProfessor.departamento // ERRO DE COMPILAÇÃO!");
        System.out.println("   Referência Pessoa não tem acesso aos atributos específicos das subclasses.\n");

        // ===== 10. CASTING (DOWNCASTING) =====
        System.out.println("10. Downcasting para acessar atributos específicos:\n");

        if (pessoaAluno instanceof Aluno) {
            Aluno alunoTemp = (Aluno) pessoaAluno;
            System.out.println("   Após cast para Aluno, matricula: " + alunoTemp.matricula);
            System.out.println("   Após cast para Aluno, curso: " + alunoTemp.curso);
        }

        if (pessoaProfessor instanceof Professor) {
            Professor profTemp = (Professor) pessoaProfessor;
            System.out.println("   Após cast para Professor, departamento: " + profTemp.departamento);
            System.out.println("   Após cast para Professor, titulacao: " + profTemp.titulacao);
        }
        System.out.println();

        // ===== 11. ARRAY POLIMÓRFICO =====
        System.out.println("11. Array polimórfico de Pessoa:\n");

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Aluno("Pedro Lima", "Rua C, 111", "333.444.555-66", "2024003", "Medicina");
        pessoas[1] = new Professor("Prof. Lucas Dias", "Av. Central, 222", "777.888.999-00", "Física", "Doutorado");
        pessoas[2] = new Aluno("Juliana Rocha", "Rua D, 333", "444.555.666-77", "2024004", "Direito");

        for (Pessoa p : pessoas) {
            System.out.println("   Nome: " + p.getNome());
            System.out.println("   Tipo: " + p.getClass().getSimpleName());
            System.out.println("   Saudação: " + p.saudacao());
            System.out.println();
        }

        System.out.println("=== FIM DOS EXEMPLOS ===");
    }

}
