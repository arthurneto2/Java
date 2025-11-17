package exemplos.POO.classes.livros;

public class LivrosDeLivraria extends Livros {
    int codigoDeBarras;
    double valor;
    boolean emprestado;

    public LivrosDeLivraria(String titulo, String autor, String editora, int ano, int codigoDeBarras, double valor) {
        super(titulo, autor, editora, ano);
        this.codigoDeBarras = codigoDeBarras;
        this.valor = valor;
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return "LivrosDeLivraria{" + "codigoDeBarras=" + codigoDeBarras + ", valor=" + valor + ", emprestado=" + emprestado + '}';
    }

}
