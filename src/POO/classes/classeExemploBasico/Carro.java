package POO.classes.classeExemploBasico;

public class Carro {
    //Atributos
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    //Metodos
        //Construtor composto
    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
        //Construtor simples
    public Carro(){}

        //Cnstrutor com dois parametros
    public Carro(String marca, String modelo) {
        this(marca, modelo, 4, 50, 10);
    }

    public double calculaAutonomia(){
        return (capacidadeCombustivel * consumoCombustivel);
    }

        //Geters, Seters(lê e escreve os atributos) e ToString(mostra os valores dos atributos)
    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", numeroPassageiros=" + numeroPassageiros + ", capacidadeCombustivel=" + capacidadeCombustivel + ", consumoCombustivel=" + consumoCombustivel + '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }
}
