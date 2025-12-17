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
            return getRendaBruta() * 0;
        }
        if (getRendaBruta() <= 2100) {
            return getRendaBruta() * 0.10;
        }
        if (getRendaBruta() <= 2800) {
            return getRendaBruta() * 0.15;
        }
        if (getRendaBruta() <= 3600) {
            return getRendaBruta() * 0.25;
        }
        return getRendaBruta() * 0.30;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}
