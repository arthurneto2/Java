package exemplos.iniciais;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triangulo: ");
        double lado3 = scanner.nextDouble();

        boolean trinagulo = lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
        boolean equilatero = false;
        boolean isosceles = false;
        boolean escaleno = false;

        if (trinagulo){
            equilatero = lado1 == lado2 && lado2 == lado3;
            isosceles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
            escaleno = lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
        }

        System.out.println("Triangulo: " + trinagulo);
        System.out.println("Equilatero: " + equilatero);
        System.out.println("Isosceles: " + isosceles);
        System.out.println("Escaleno: " + escaleno);

    }
}
