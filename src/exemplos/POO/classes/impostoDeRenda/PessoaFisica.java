package exemplos.POO.classes.impostoDeRenda;

public class PessoaFisica extends Contribuinte{
    private double cpf;

    public PessoaFisica(String nome, double rendaBruta, double cpf) {
        super.setNome(nome);
        super.setRendaBruta(rendaBruta);
        this.cpf = cpf;
    }



    @Override
    public double calcularImposto() {
        if (getRendaBruta() <= 1400){
            setPorcentagemImposto(0);
        } else if (getRendaBruta() <= 2100) {
            setPorcentagemImposto(10);
        } else if (getRendaBruta() <= 2800) {
            setPorcentagemImposto(15);
        } else if (getRendaBruta() <= 3600) {
            setPorcentagemImposto(25);
        } else {
            setPorcentagemImposto(30);
        }
        return getRendaBruta() * getPorcentagemImposto() / 100 ;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}
