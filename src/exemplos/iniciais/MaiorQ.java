package exemplos.iniciais;

import java.util.Scanner;

public class MaiorQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }else {
            System.out.println(num2 + " é maior que " + num1);
        }


    }
}
