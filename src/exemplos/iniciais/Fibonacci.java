package exemplos.iniciais;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos: ");
        int quantidadeTermos = scanner.nextInt();
        
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < quantidadeTermos - 2; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            if (n3 > 500){
                break;
            }
            n1 = n2;
            n2 = n3;
        }
    }
}
