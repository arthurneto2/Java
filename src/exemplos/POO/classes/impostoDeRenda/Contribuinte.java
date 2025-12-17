package exemplos.POO.classes.impostoDeRenda;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;
    private double porcentagemImposto;


    public Contribuinte(String nome, double rendaBruta, double porcentagemImposto) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
        this.porcentagemImposto = porcentagemImposto;
    }

    public Contribuinte() {

    }

    public abstract double calcularImposto();

    public double getPorcentagemImposto() {
        return porcentagemImposto;
    }

    public void setPorcentagemImposto(double porcentagemImposto) {
        this.porcentagemImposto = porcentagemImposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
}
