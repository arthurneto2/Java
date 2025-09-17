package exemplos.iniciais;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int value = scanner.nextInt();

        if(value > 0){
            System.out.println("O valor digitado é positivo...");
        }else if(value == 0){
            System.out.println("Você digitou um número neutro...");
        }else {
            System.out.println("O valor digitaddo é negativo...");
        }


    }
}
