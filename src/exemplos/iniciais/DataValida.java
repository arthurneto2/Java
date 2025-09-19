package exemplos.iniciais;

import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a data no formato dd/mm/aaaa: ");
        String data = scan.next();

        String[] partes = data.split("/");

        if (partes.length == 3){
            if (partes[0].length() == 2 && partes[1].length() == 2 && partes[2].length() == 4){
                if (Integer.parseInt(partes[0]) <= 31 && Integer.parseInt(partes[1]) <= 12){
                    System.out.println("Data valida");
                    return;
                }
            }
        }
        System.out.println("Data invalida");
    }
}
