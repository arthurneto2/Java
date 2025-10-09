package exemplos.iniciais;

import java.util.Scanner;

public class MaiorMenorSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam;
        do {
            System.out.println("Digite o tamamnho do conjunto entre 0 e 1000: ");
            tam = scanner.nextInt();
        }while (tam < 0 || tam > 1000);
        int maior = 0;
        int menor = 0;
        int soma = 0;
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o " + (i+1) + " numero: ");
            int num = scanner.nextInt();
            if (i == 0){
                maior = num;
                menor = num;
            }else if( maior < num) {
                maior = num;
            }else if( menor > num) {
                menor = num;
            }
            soma += num;
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Soma dos numeros: " + soma);
    }
}
