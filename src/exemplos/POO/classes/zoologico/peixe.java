package exemplos.POO.classes.zoologico;

public class peixe extends Animal {
    private String caracteristica;

    public peixe(String nome, double comprimento, double velocidade, String caracteristica) {
        super(nome, comprimento, "Cinzento", "Mar", velocidade);
        super.setNumeroPatas(0);
        this.caracteristica = "Barbatanas e cauda";
    }
    public String toString() {
        return "Animal : " + super.getNome() + "\n" +
                "Comprimento : " + super.getComprimento() + " cm" + "\n" +
                "Número de patas : " + super.getNumeroPatas() + "\n" +
                "Cor : " + super.getCor() + "\n" +
                "Ambiente : " + super.getAmbiente() + "\n" +
                "Velocidade : " + super.getVelocidade() + " m/s" + "\n" +
                "Caracteristica : " + this.getCaracteristica() + "\n";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
