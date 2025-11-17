package exemplos.POO.classes.lampadaDeSupermercado;

public class Lampada {
    int codigoDeBarras;
    String marca;
    String cor;
    double potencia;
    double valor;

    public Lampada(int codigoDeBarras, String marca, String cor, double potencia, double valor) {
        this.codigoDeBarras = codigoDeBarras;
        this.marca = marca;
        this.cor = cor;
        this.potencia = potencia;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Lampada{" + "codigoDeBarras=" + codigoDeBarras + ", marca=" + marca + ", cor=" + cor + ", potencia=" + potencia + ", valor=" + valor + '}';
    }
}
