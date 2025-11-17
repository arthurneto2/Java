package exemplos.POO.classes.livros;

public class Main {
    public static void main(String[] args) {
        Livros livro = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", 1954);
        System.out.println(livro);

        LivrosDeLivraria livroDeLivraria = new LivrosDeLivraria(livro.titulo, livro.autor, livro.editora, livro.ano, 1001, 10);
        System.out.println(livroDeLivraria);

        livroDeLivraria.emprestado = true;
        System.out.println(livroDeLivraria);
    }
}
