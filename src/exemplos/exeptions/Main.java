package exemplos.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.print(exibirMenuPrincipal());
            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira uma opção válida.");
                scanner.nextLine(); // Limpar o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    Contato novoContato = criarContato();
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o ID do contato que deseja buscar:");
                    try {
                        int idBuscar = scanner.nextInt();
                        Contato contatoBuscado = agenda.buscarContatoPorId(idBuscar);
                        System.out.println("Contato encontrado: ID: " + contatoBuscado.getId() + ", Nome: " + contatoBuscado.getNome() + ", Telefone: " + contatoBuscado.getTelefone());
                    } catch (ContatoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, tente novamente.");
                        scanner.nextLine(); // Limpar o buffer
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID do contato que deseja remover:");
                    try {
                        int idRemover = scanner.nextInt();
                        agenda.removerContatoPorId(idRemover);
                        System.out.println("Contato removido com sucesso!");
                    } catch (ContatoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, tente novamente.");
                        scanner.nextLine(); // Limpar o buffer
                    }
                    break;
                case 4:
                    editarContato(agenda);
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    public static String exibirMenuPrincipal() {
        return """
                === Menu Principal ===
                1. Adicionar Contato
                2. Buscar Contato por ID
                3. Remover Contato por ID
                4. Editar Contato
                5. Listar Contatos
                6. Sair
                Escolha uma opção:\s""";
    }

    public static Contato criarContato() {
        try{
            Scanner scanner = new Scanner(System.in);
            Contato contato = new Contato();
            System.out.println("Digite o nome do contato:");
            contato.setNome(scanner.nextLine());
            System.out.println("Digite o telefone do contato:");
            contato.setTelefone(scanner.nextLine());
            contato.setId(IdContato.gerarId());
            return contato;
        }catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            return null;
        }
    }

    public static void editarContato(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o ID do contato que deseja editar:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            System.out.println("Digite o novo nome do contato:");
            String novoNome = scanner.nextLine();
            System.out.println("Digite o novo telefone do contato:");
            String novoTelefone = scanner.nextLine();
            agenda.editarContato(id, novoNome, novoTelefone);
            System.out.println("Contato editado com sucesso!");
        } catch (ContatoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
        }
    }
}