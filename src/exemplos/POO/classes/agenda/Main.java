package exemplos.POO.classes.agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da agenda: ");
        String nomeAgenda = scanner.nextLine();

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nContato " + (i + 1) + ":");
            contatos[i] = criaContato(scanner);
        }

        Agenda agenda = new Agenda(nomeAgenda, contatos);

        System.out.println("\n=== Agenda: " + agenda.getNome() + " ===");
        System.out.println(agenda.retornaTodosContatos());

        scanner.close();
    }

    public static Contato criaContato(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Contato(nome, telefone, email);
    }
}
