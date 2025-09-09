package condicionais;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto ");
        int precos = scanner.nextInt();

        if (precos <= 10){
            System.out.println("Está barato...");
        }else if (precos < 15){
            System.out.println("Preço normal...");
        }else if (precos < 20){
            System.out.println("Pesquisar mais...");
        }else {
            System.out.println("Muito caro...");
        }

    }
}
