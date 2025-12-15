package POO.classes.relacionamentoEntreClasses;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Endereco (relacionamento 1:1 com Contato)
        Endereco endereco = new Endereco(
                "Rua das Flores", "123",
                "São Paulo",
                "SP",
                "01234-567"
        );

        // Criando múltiplos objetos Telefone (relacionamento 1:N com Contato)
        Telefone telefone1 = new Telefone();
        telefone1.setTipoTelefone("Residencial");
        telefone1.setDdd("11");
        telefone1.setNumero("1234-5678");

        Telefone telefone2 = new Telefone();
        telefone2.setTipoTelefone("Celular");
        telefone2.setDdd("11");
        telefone2.setNumero("98765-4321");

        Telefone telefone3 = new Telefone();
        telefone3.setTipoTelefone("Comercial");
        telefone3.setDdd("11");
        telefone3.setNumero("3000-4000");

        // Array de telefones para demonstrar relacionamento 1:N
        Telefone[] telefones = {telefone1, telefone2, telefone3};

        // Criando um objeto Contato com relacionamento 1:1 para Endereco e 1:N para Telefone
        Contato contato = new Contato("João Silva", endereco, telefones);

        // Exibindo informações do contato
        System.out.println("=== INFORMAÇÕES DO CONTATO ===");
        System.out.println("Nome: " + contato.getNome());

        // Demonstrando relacionamento 1:1 (Contato -> Endereco)
        System.out.println("\n=== ENDEREÇO (Relacionamento 1:1) ===");
        System.out.println("Rua: " + contato.getEndereco().getRua() + ", " + contato.getEndereco().getNumero());
        System.out.println("Cidade: " + contato.getEndereco().getCidade());
        System.out.println("Estado: " + contato.getEndereco().getEstado());
        System.out.println("CEP: " + contato.getEndereco().getCep());

        // Demonstrando relacionamento 1:N (Contato -> Telefones)
        System.out.println("\n=== TELEFONES (Relacionamento 1:N) ===");
        for (int i = 0; i < contato.getTelefones().length; i++) {
            Telefone tel = contato.getTelefones()[i];
            System.out.println((i + 1) + ". " + tel.getTipoTelefone() + ": (" + tel.getDdd() + ") " + tel.getNumero());
        }
    }
}
