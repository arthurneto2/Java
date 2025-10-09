package exemplos.iniciais;

import java.util.Scanner;

public class Cds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de CDs da coleção: ");
        int quantidadeCDs = scanner.nextInt();
        double preco = 0;
        for (int i = 0; i < quantidadeCDs; i++) {
            System.out.println("Digite o valor do CD " + (i+1) + ": ");
            preco += scanner.nextDouble();
        }
        System.out.println("Total: " + preco);
        System.out.println("Media do valor dos CDs: " + (preco / quantidadeCDs));
    }
}
