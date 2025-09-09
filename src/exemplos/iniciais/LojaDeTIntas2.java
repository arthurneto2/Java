package exemplos.iniciais;

import java.util.Scanner;

public class LojaDeTIntas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a area a sem pintada [M2]: ");
        double metrosQuadrados = scanner.nextDouble();

        double litrosTinta = metrosQuadrados / 6;
        System.out.println("Litros a serem comprados: " + litrosTinta);

        double latas = Math.ceil(litrosTinta / 18);
        System.out.println("Quantidade de latas 18L: " + latas);
        System.out.println("Valor da compra em latas 18L: R$" + latas * 80);

        double galoes = Math.ceil(litrosTinta / 3.6);
        System.out.println("Quantidade de galões 3.6L: " + galoes);
        System.out.println("Valor da compra em galões 3.6L: R$" + galoes * 25);

        double quantLatasMix = 0;
        double quantGaloesMix;
        while(litrosTinta > 17){
            litrosTinta -= 18;
            quantLatasMix++;
        }
        quantGaloesMix = Math.ceil(litrosTinta / 3.6);

        System.out.println("Compra mista...");
        System.out.println("Latas: " + quantLatasMix);
        System.out.println("Galões: " + quantGaloesMix);
        System.out.println("Valor: R$" + ((quantLatasMix * 80) + (quantGaloesMix * 25)));

    }
}
