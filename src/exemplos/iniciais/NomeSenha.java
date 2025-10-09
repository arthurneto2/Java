package exemplos.iniciais;

import java.util.Scanner;

public class NomeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;
        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine();
            if (nome.equals(senha)){
                System.out.println("Nome e senha iguais...");
            }
        }while (nome.equals(senha));

        System.out.println("Usuario cadastrado com sucesso!");
    }
}
