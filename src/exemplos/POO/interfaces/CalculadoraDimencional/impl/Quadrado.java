package exemplos.POO.interfaces.CalculadoraDimencional.impl;

public class Quadrado extends Figura2D{
    private double lado;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", lado=" + lado +
                ", area=" + calcularArea() +
                "}";
    }
}
