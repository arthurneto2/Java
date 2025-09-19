package exemplos.iniciais;

import java.util.Scanner;

public class CentenaDezenaUnidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 999: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 999){
            System.out.println("Número inválido!");
            return;
        }
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;


        System.out.printf("%d = ",numero);
        if (centenas > 0) {
            if (centenas == 1){
                System.out.printf("%d centenas, ", centenas);
                return;
            }else{
                System.out.printf("%d centenas, ", centenas);
            }
        }
        if (dezenas > 0) {
            if (dezenas == 1){
                System.out.printf("%d dezena e ", dezenas);
                return;
            }else{
                System.out.printf("%d dezenas e ", dezenas);
            }
        }
        if (unidades > 0) {
            if (unidades == 1){
                System.out.printf("%d unidade", unidades);
            }else{
                System.out.printf("%d unidades", unidades);
            }
        }


    }
}
