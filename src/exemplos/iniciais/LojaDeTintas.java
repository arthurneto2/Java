package exemplos.iniciais;

import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digete o tamnho da area de que deseja pintar [M2]");
        double areaPintada = scanner.nextInt();

        double quantidadeLatas = areaPintada / 6;

        quantidadeLatas = Math.ceil(quantidadeLatas);
        System.out.println("Quantidade de latas: " + quantidadeLatas);
        System.out.println("Valor: R$" + quantidadeLatas * 80);
    }
}
