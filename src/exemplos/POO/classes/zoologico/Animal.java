package exemplos.POO.classes.zoologico;

public class Animal {
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }
    public String toString() {
        return "Animal : " + this.getNome() + "\n" +
                "Comprimento : " + this.getComprimento() + " cm" + "\n" +
                "Número de patas : " + this.getNumeroPatas() + "\n" +
                "Cor : " + this.getCor() + "\n" +
                "Ambiente : " + this.getAmbiente() + "\n" +
                "Velocidade : " + this.getVelocidade() + " m/s" + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
