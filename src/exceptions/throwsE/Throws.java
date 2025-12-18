package exceptions.throwsE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try{
            int valor = capituraEntrada();
            System.out.println("O valor digitado foi: " + valor);
        }catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

        System.out.println("Encerrando o programa...");

    }

    public static int capituraEntrada() throws Exception{
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um valor : ");
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            throw new Exception("Entrada inválida, por favor digite um número inteiro.");
        }
    }
}
