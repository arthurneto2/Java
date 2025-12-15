package exemplos.POO.classes.agenda;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public String retornaInfoContato(int index){
        if(index < 0 || index >= contatos.length){
            return "Índice inválido.";
        }
        Contato contato = contatos[index];
        return "Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone() + ", Email: " + contato.getEmail();
    }

    public String retornaTodosContatos(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < contatos.length; i++){
            sb.append(retornaInfoContato(i))
              .append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
