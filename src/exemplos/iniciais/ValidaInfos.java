package exemplos.iniciais;

import java.util.Scanner;

public class ValidaInfos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        do {
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            if (nome.length()<= 3){
                System.out.println("Digite um nome valido...");
            }
        }while (nome.length() <= 3);

        int idade;
        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("Digite uma idade valida...");
            }
        }while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();
            if (salario < 0){
                System.out.println("Digite um salario valido...");
            }
        }while (salario < 0);

        char sexo;
        do {
            System.out.println("Digite seu sexo: ");
            sexo = scan.next().charAt(0);
            if (sexo != 'M' && sexo != 'F'){
                System.out.println("Digite um sexo valido...");
            }
        }while (sexo != 'M' && sexo != 'F');

        char estadoCivil;
        do {
            System.out.println("Digite seu estado civil: ");
            estadoCivil = scan.next().charAt(0);
            if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V'){
                System.out.println("Digite um estado civil valido...");
            }
        }while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V');

        System.out.println("Informacoes validadas...");

    }
}
