package exemplos.POO.interfaces.CalculadoraDimencional.impl;

public class Piramide extends Figura3D{
    private double base;
    private double altura;

    public Piramide(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (1.0/3.0) * (base * base) * altura;
    }

    @Override
    public double calcularArea() {
        return base * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", volume=" + calcularVolume() +
                "}";
    }
}
