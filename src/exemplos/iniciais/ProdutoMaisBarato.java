package exemplos.iniciais;

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        double smallerProduct = scanner.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        double secondProduct = scanner.nextDouble();
        if (secondProduct < smallerProduct) {
            smallerProduct = secondProduct;
        }

        System.out.println("Digite o valor do terceiro produto: ");
        double thirdProduct = scanner.nextDouble();
        if (thirdProduct < smallerProduct){
            smallerProduct = thirdProduct;
        }

        System.out.println("O produto que deve ser comprado é o de R$" + smallerProduct);


    }
}
