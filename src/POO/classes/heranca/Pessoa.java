package POO.classes.heranca;

public abstract class Pessoa {
    String nome;
    protected String endereco;
    private String cpf;

    public Pessoa(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String saudacao() {
        return "Olá, eu sou uma pessoa.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
