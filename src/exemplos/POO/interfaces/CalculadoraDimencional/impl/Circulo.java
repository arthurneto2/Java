package exemplos.POO.interfaces.CalculadoraDimencional.impl;

public class Circulo extends Figura2D{
    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", raio=" + raio +
                ", area=" + calcularArea() +
                "}";
    }
}
