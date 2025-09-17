package exemplos.iniciais;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um letra: ");
        String letra = scanner.next();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }

    }
}
