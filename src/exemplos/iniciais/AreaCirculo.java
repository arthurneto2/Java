package exemplos.iniciais;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        double area =  Math.PI * raio * raio;
        System.out.println("A área do circulo é: " + area);

    }
}
