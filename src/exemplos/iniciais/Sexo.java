package exemplos.iniciais;

import java.util.Scanner;

public class Sexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite p seu sexo [M/F]: ");
        String sexo = scanner.next();

        if (sexo.equals("M")){
            System.out.println("Sexo: MASCULINO");
        } else if(sexo.equals("F")) {
            System.out.println("Sexo: FEMININO");
        }else {
            System.out.println("Sexo inválido...");
        }

    }
}
