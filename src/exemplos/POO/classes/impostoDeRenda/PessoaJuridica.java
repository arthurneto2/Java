package exemplos.POO.classes.impostoDeRenda;

public class PessoaJuridica extends Contribuinte {
    private double cnpj;

    public PessoaJuridica(String nome, double rendaBruta, double cnpj, double porcentagemImposto) {
        super(nome, rendaBruta, porcentagemImposto);
        this.cnpj = cnpj;
    }

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * (this.getPorcentagemImposto()/100);
    }
}
