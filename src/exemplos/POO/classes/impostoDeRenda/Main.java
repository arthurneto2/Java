package exemplos.POO.classes.impostoDeRenda;

public class Main {
    public static void main(String[] args) {
        // Criando 3 Pessoas Jurídicas
        PessoaJuridica pj1 = new PessoaJuridica("Empresa ABC Ltda", 50000.0, 12345678000190L);
        PessoaJuridica pj2 = new PessoaJuridica("Tech Solutions S.A.", 120000.0, 98765432000180L);
        PessoaJuridica pj3 = new PessoaJuridica("Comércio XYZ ME", 35000.0, 11223344000155L);

        // Criando 3 Pessoas Físicas
        PessoaFisica pf1 = new PessoaFisica("João Silva", 1200.0, 12345678901L);
        PessoaFisica pf2 = new PessoaFisica("Maria Santos", 2500.0, 98765432109L);
        PessoaFisica pf3 = new PessoaFisica("Carlos Oliveira", 4000.0, 11223344556L);

        // Calculando e exibindo impostos para Pessoas Jurídicas
        System.out.println("=== PESSOAS JURÍDICAS ===");
        System.out.println(pj1.toString());
        System.out.println(pj2.toString());
        System.out.println(pj3.toString());
        // Calculando e exibindo impostos para Pessoas Físicas
        System.out.println("=== PESSOAS FÍSICAS ===");
        System.out.println(pf1.toString());
        System.out.println(pf2.toString());
        System.out.println(pf3.toString());
    }
}
