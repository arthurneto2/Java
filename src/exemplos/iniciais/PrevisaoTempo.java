package exemplos.iniciais;

import java.util.Scanner;

public class PrevisaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            int i = 0;
            double temperatura;
            double somaTemperaturas = 0;
            double mediaTemperaturas;
            double temperaturaMinima = 0;
            double temperaturaMaxima = 0;
            boolean adicionarTemperatura = true;
            do {
                System.out.println("Digite a temperatura [" + (i + 1) + "] [7777 - encerra a temperatura]: ");
                temperatura = scanner.nextDouble();
                if (temperatura == 7777){
                    adicionarTemperatura = false;
                }else {
                    somaTemperaturas += temperatura;
                    if (i == 0){
                        temperaturaMinima = temperatura;
                        temperaturaMaxima = temperatura;
                    }else {
                        if (temperatura > temperaturaMaxima){
                            temperaturaMaxima = temperatura;
                        }else if (temperatura < temperaturaMinima){
                            temperaturaMinima = temperatura;
                        }
                    }
                    i++;
                }
            }while (adicionarTemperatura);
            mediaTemperaturas = somaTemperaturas / i;
            System.out.println("A temperatura minima registrada foi: " + temperaturaMinima);
            System.out.println("A temperatura maxima registrada foi: " + temperaturaMaxima);
            System.out.println("A media das temperaturas registradas foi: " + mediaTemperaturas);


            System.out.println("Encerrar Programa? [S/N]");
        }while (!(scanner.next().equalsIgnoreCase("S")));

    }
}
