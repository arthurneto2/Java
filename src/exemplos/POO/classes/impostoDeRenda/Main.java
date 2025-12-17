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
        System.out.println(pj1.getNome() + " - Renda: R$ " + pj1.getRendaBruta() + " - Imposto: R$ " + pj1.calcularImposto());
        System.out.println(pj2.getNome() + " - Renda: R$ " + pj2.getRendaBruta() + " - Imposto: R$ " + pj2.calcularImposto());
        System.out.println(pj3.getNome() + " - Renda: R$ " + pj3.getRendaBruta() + " - Imposto: R$ " + pj3.calcularImposto());

        // Calculando e exibindo impostos para Pessoas Físicas
        System.out.println("\n=== PESSOAS FÍSICAS ===");
        System.out.println(pf1.getNome() + " - Renda: R$ " + pf1.getRendaBruta() + " - Imposto: R$ " + pf1.calcularImposto());
        System.out.println(pf2.getNome() + " - Renda: R$ " + pf2.getRendaBruta() + " - Imposto: R$ " + pf2.calcularImposto());
        System.out.println(pf3.getNome() + " - Renda: R$ " + pf3.getRendaBruta() + " - Imposto: R$ " + pf3.calcularImposto());
    }
}
