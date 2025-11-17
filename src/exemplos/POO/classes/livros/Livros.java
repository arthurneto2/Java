package exemplos.POO.classes.livros;

public class Livros {
    String titulo;
    String autor;
    String editora;
    int ano;

    public Livros(String titulo, String autor, String editora, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livros{" + "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + '}';
    }
}
