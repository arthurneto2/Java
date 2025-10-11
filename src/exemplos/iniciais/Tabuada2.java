package exemplos.iniciais;

import java.util.Scanner;

public class Tabuada2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada: ");
        int tabuado = scanner.nextInt();

        System.out.println("Digite o primeiro valor da tabuada");
        int inicialValue = scanner.nextInt();

        System.out.println("Digite o ultimo valor da tabuada");
        int finalValue = scanner.nextInt();

        System.out.println("Tabuada de " + tabuado);
        if (inicialValue > finalValue){
            for (int i = finalValue; i <= inicialValue; i++) {
                System.out.println(tabuado + " x " + i + " = " + (tabuado * i));
            }
        }else {
            for (int i = inicialValue; i <= finalValue; i++) {
                System.out.println(tabuado + " x " + i + " = " + (tabuado * i));
            }
        }
    }
}
