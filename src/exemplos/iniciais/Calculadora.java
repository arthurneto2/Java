package exemplos.iniciais;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double value = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double secondValue = scanner.nextDouble();

        System.out.println("Digite a operação que deseja realizar [+, -, *, /]:");
        String operation = scanner.next();

        boolean valida = true;
        double result = 0;

        switch (operation){
            case "+":
                result = value + secondValue;
                break;
            case "-":
                result = value - secondValue;
                break;
            case "*":
                result = value * secondValue;
                break;
            case "/":
                result = value / secondValue;
                break;
            default:
                System.out.println("Operação invalida...");
                valida = false;
        }

        if (valida){
            if (result >= 0){
                System.out.println("Resultado positivo...");
            } else {
                System.out.println("Resultado negativo...");
            }

            if (result % 2 == 0){
                System.out.println("Resultado par...");
            }else {
                System.out.println("Resultado impar...");
            }
        }


    }
}
