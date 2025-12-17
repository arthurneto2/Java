package exemplos.POO.interfaces.CalculadoraDimencional.impl;

public class Cubo extends Figura3D {

    private double lado;

    public Cubo(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", lado=" + lado +
                ", area=" + calcularArea() +
                ", volume=" + calcularVolume() +
                "}";
    }
}
