package exemplos.iniciais;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas na turma: ");
        int quantidadePessoas = scanner.nextInt();
        int idade;
        int somaIdade = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da [" + (i+1) + "] pessoa: ");
            idade = scanner.nextInt();
            somaIdade += idade;
        }
        int mediaIdeade = somaIdade/quantidadePessoas;

        if (mediaIdeade <= 25){
            System.out.println("A turma é jovem");
        } else if (mediaIdeade <= 60) {
            System.out.println("A turmar é adulta");
        } else{
            System.out.println("A turma é idosa");
        }
    }
}
