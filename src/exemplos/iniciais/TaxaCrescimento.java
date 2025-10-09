package exemplos.iniciais;

import java.util.Scanner;

public class TaxaCrescimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do {
            System.out.println("Digite a taxa de crescimento da populacao A: ");
            long populacaoA = scanner.nextInt();
            System.out.println("Digite a taxa de crescimento da populacao B: ");
            long populacaoB = scanner.nextInt();

            System.out.println("Digite a taxa de crescimento da populacao A: ");
            double taxaCrescimentoA = scanner.nextDouble();
            System.out.println("Digite a taxa de crescimento da populacao B: ");
            double taxaCresciemtoB = scanner.nextDouble();
            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += (long) (populacaoA * taxaCrescimentoA / 100);
                populacaoB += (long) (populacaoB * taxaCresciemtoB / 100);
                anos++;
            }

            System.out.println("A populacao A chegou a " + populacaoA + " e a populacao B chegou a " + populacaoB + " em "
                    + anos + " anos");

            System.out.println("Deseja continuar? (S/N)");
            if (scanner.next().equalsIgnoreCase("n")){
                continuar = false;
            }
        }while (continuar);
    }
}
