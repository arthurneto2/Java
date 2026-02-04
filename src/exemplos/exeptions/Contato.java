package exemplos.exeptions;

public class Contato {
    private static int contador = 0;
    private int id;
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        contador++;
        this.nome = nome;
        this.telefone = telefone;
        this.id = contador;
    }

    public Contato() {
        contador++;
        this.id = contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
