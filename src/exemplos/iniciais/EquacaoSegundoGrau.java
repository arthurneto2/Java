package exemplos.iniciais;


import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0){
            System.out.println("Sua equação não é do segundo grau");
            return;
        }

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0){
            System.out.println("Sua equação nao possui raizes reais");
        } else if (delta == 0){
            System.out.println("Sua equação possui somente uma raiz real");
            System.out.println("X = " + x1);
        }else{
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}
