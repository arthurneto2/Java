package exemplos.iniciais;

import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda [M/V/N]: ");
        String turno = scanner.next();

        switch (turno){
            case "M":
                System.out.println("BOM DIA!!!");
                break;
            case "V":
                System.out.println("BOA TARDE!!!");
                break;
            case "N":
                System.out.println("BOA NOITE!!!");
                break;
            default:
                System.out.println("Dados inválidos...");
                break;
        }

    }
}
