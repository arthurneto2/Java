package exemplos.POO.classes.lampadaDeSupermercado;

public class Lampada {
    private int codigoDeBarras;
    private String marca;
    private String cor;
    private double potencia;
    private double valor;
    private boolean ligada;

    public Lampada(int codigoDeBarras, String marca, String cor, double potencia, double valor) {
        this.codigoDeBarras = codigoDeBarras;
        this.marca = marca;
        this.cor = cor;
        this.potencia = potencia;
        this.valor = valor;
        this.ligada = false;
    }

    public Lampada(){}

    void ligar(){
        this.ligada = true;
    }

    void desligar(){
        this.ligada = false;
    }

    @Override
    public String toString() {
        return "Lampada{" + "codigoDeBarras=" + codigoDeBarras + ", marca=" + marca + ", cor=" + cor + ", potencia=" + potencia + ", valor=" + valor + '}';
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
