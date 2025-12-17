package exemplos.POO.classes.impostoDeRenda;

public class PessoaJuridica extends Contribuinte {
    private double cnpj;

    public PessoaJuridica(String nome, double rendaBruta, double cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * ((double) 10 / 100);
    }

    @Override
    public String toString() {
        return "Pessoa Juridica: \n" +
                "Nome: " + getNome() + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Renda Bruta: " + getRendaBruta() + "\n" +
                "Imposto: " + calcularImposto() + "\n";
    }

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

}
