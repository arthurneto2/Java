package exemplos.iniciais;

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNum = 0;
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + " numero:");
            num = scanner.nextInt();

            if (i == 0){
                maiorNum = num;
            }else if( maiorNum < num) {
                maiorNum = num;
            }
        }

        System.out.println("O maior numero digitado foi: " + maiorNum);

    }
}
