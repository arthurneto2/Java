package exemplos.iniciais;

import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int menor25 = 0;
        int menor50 = 0;
        int menor75 = 0;
        int menor100 = 0;

        do {
            System.out.println("Digite um valor positivo: " );
            valor = scanner.nextInt();

            if (valor < 0){
                break;
            }

            if (valor <= 25){
                menor25++;
            } else if (valor <= 50) {
                menor50++;
            } else if (valor <= 75) {
                menor75++;
            } else if (valor <= 100) {
                menor100++;
            }
        }while (true);

        System.out.println("Quantidade de valores entre 0 e 25: " + menor25);
        System.out.println("Quantidade de valores entre 26 e 50: " + menor50);
        System.out.println("Quantidade de valores entre 51 e 75: " + menor75);
        System.out.println("Quantidade de valores entre 76 e 100: " + menor100);
    }
}
