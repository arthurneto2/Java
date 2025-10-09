package exemplos.iniciais;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;

        if (valor1 > valor2){
            for (int i = valor1; i >= valor2; i--){
                System.out.println(i);
                soma += i;
            }
        }else {
            for (int i = valor1; i <= valor2; i++){
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
