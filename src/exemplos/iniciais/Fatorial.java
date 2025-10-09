package exemplos.iniciais;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;
        int n, resultado;
        do {
            do {
                System.out.println("Digite o valor de n (n < 16): ");
                n =  scanner.nextInt();
                resultado = n;
            }while (n > 16);
            System.out.printf("%d! = ", n);
            for (int i = n; i > 1; i--) {
                System.out.printf("%d.", i);
                resultado *= (i - 1);
            }
            System.out.println(1 + " = " + resultado);
            System.out.println("Deseja sair? (0-sim)");
            if (scanner.nextInt() == 0){
                continua = false;
            }
        }while (continua);
    }
}
