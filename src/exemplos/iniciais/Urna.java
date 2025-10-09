package exemplos.iniciais;

import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        System.out.println("Digiete a quantidade de eleitores: ");
        int quantidadeEleitores = scanner.nextInt();
        int voto;
        for (int i = 0; i < quantidadeEleitores; i++) {
            do {
                System.out.println("Digite o seu voto [1] ou [2] ou [3]:");
                voto = scanner.nextInt();
            } while (voto < 1 || voto > 3);

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else {
                candidato3++;
            }
        }

        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
    }
}
