package exemplos.exeptions;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public Contato buscarContatoPorId(int id) throws ContatoNaoEncontradoException {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                return contato;
            }
        }
        throw new ContatoNaoEncontradoException("Contato com ID " + id + " não encontrado.");
    }

    public void removerContatoPorId(int id) throws ContatoNaoEncontradoException {
        Contato contato = buscarContatoPorId(id);
        this.contatos.remove(contato);
    }

    public void editarContato(int id, String novoNome, String novoTelefone) throws ContatoNaoEncontradoException {
        Contato contato = buscarContatoPorId(id);
        contato.setNome(novoNome);
        contato.setTelefone(novoTelefone);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("ID: " + contato.getId() + ", Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }


}
