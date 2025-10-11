package exemplos.iniciais;

import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        int voto;

        do {
            do {
                System.out.println("### Candiatos ###");
                System.out.println("1 - José");
                System.out.println("2 - João");
                System.out.println("3 - Maria");
                System.out.println("4 - Marcos");
                System.out.println("0 - Nulo");
                System.out.println("5 - Branco");

                System.out.println("Digite o seu voto: ");
                voto = scanner.nextInt();
            } while (voto < 0 || voto > 5);
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 0:
                    votosNulos++;
                    break;
                case 5:
                    votosBrancos++;
                    break;
            }
            totalVotos++;
            System.out.println("Desejea encerrar o programa? [S/N]: ");
        } while (!scanner.next().equalsIgnoreCase("s"));

        System.out.println("Votos Candidato 1: " + votosCandidato1);
        System.out.println("Votos Candidato 2: " + votosCandidato2);
        System.out.println("Votos Candidato 3: " + votosCandidato3);
        System.out.println("Votos Candidato 4: " + votosCandidato4);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos Brancos: " + votosBrancos);
        System.out.println("Porcentagem de votos brancos: " + (votosBrancos * 100 / totalVotos) + "%");
        System.out.println("Porcentagem de votos nulos: " + (votosNulos * 100 / totalVotos) + "%");

    }
}
