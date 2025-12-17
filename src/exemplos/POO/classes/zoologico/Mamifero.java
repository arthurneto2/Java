package exemplos.POO.classes.zoologico;

public class Mamifero extends Animal{
    private String alimentoPreferido;

    public Mamifero(String nome, double comprimento, String cor, String ambiente, double velocidade, String alimentoPreferido) {
        super(nome, comprimento, cor, "Terra", velocidade);
        this.alimentoPreferido = alimentoPreferido;
    }

    public String toString() {
        return "Animal : " + super.getNome() + "\n" +
                "Comprimento : " + super.getComprimento() + " cm" + "\n" +
                "Número de patas : " + super.getNumeroPatas() + "\n" +
                "Cor : " + super.getCor() + "\n" +
                "Ambiente : " + super.getAmbiente() + "\n" +
                "Velocidade : " + super.getVelocidade() + " m/s" + "\n" +
                "Alimento preferido : " + this.alimentoPreferido + "\n";
    }

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }
}
