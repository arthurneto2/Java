package exemplos.POO.interfaces.CalculadoraDimencional.impl;

public class Cilindro extends Figura3D{
    private double raio;
    private double altura;

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    @Override
    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", raio=" + raio +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", volume=" + calcularVolume() +
                "}";
    }
}
