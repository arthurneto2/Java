package exemplos.iniciais;

import java.util.Scanner;

public class PesoIdeal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoIdeal;


        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo [M/F]: ");
        String sexo = scanner.next();

        System.out.println("Digite o seu peso [KG]: ");
        double peso = scanner.nextDouble();

        if(sexo.equals("M")){
            pesoIdeal = 72.7 * altura - 58;
        }else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        if(pesoIdeal < peso){
            System.out.println("Você está acima do peso ideal...");
        }else {
            System.out.println("Você entá dentro da faixa do peso ideal...");
        }






    }
}
