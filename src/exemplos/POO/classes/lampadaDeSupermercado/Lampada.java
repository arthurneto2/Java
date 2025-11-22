package exemplos.POO.classes.lampadaDeSupermercado;

public class Lampada {
    int codigoDeBarras;
    String marca;
    String cor;
    double potencia;
    double valor;
    boolean ligada;

    public Lampada(int codigoDeBarras, String marca, String cor, double potencia, double valor) {
        this.codigoDeBarras = codigoDeBarras;
        this.marca = marca;
        this.cor = cor;
        this.potencia = potencia;
        this.valor = valor;
        this.ligada = false;
    }

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
}
