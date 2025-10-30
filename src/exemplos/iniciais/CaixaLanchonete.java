package exemplos.iniciais;

import java.util.Scanner;

public class CaixaLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidade;
        double valorParcial;
        double valorTotal = 0;

        do {
            System.out.println("Digite o codigo do item [0 para sair]: ");
            codigo = scanner.nextInt();

            if (codigo == 0){
                break;
            }

            System.out.println("Digite a quantidade: ");
            quantidade = scanner.nextInt();

            switch (codigo){
                case 100, 103: valorParcial = 1.2 * quantidade;
                          valorTotal += valorParcial;
                          break;
                case 101, 104: valorParcial = 1.3 * quantidade;
                          valorTotal += valorParcial;
                          break;
                case 102: valorParcial = 1.5 * quantidade;
                          valorTotal += valorParcial;
                          break;
                case 105: valorParcial = quantidade;
                          valorTotal += valorParcial;
                          break;
                default: System.out.println("Codigo invalido");
            }
        }while (true);
        System.out.println("Valor total: " + valorTotal);
    }
}
