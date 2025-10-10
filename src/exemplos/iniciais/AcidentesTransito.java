package exemplos.iniciais;

import java.util.Scanner;

public class AcidentesTransito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCidades = 5;
        int codigoCidade;
        int veiculosPorCidade;
        int acidentesPorCidade;
        int cidadeMenosAcidentes = 0;
        int menorNumeroAcidentes = Integer.MAX_VALUE;
        int cidadeMaisAcidentes = 0;
        int maiorNumeroAcidentes = Integer.MIN_VALUE;
        int somaTotalVeiculos = 0;
        int somaTotalAcidentes = 0;
        int mediaVeiculos;
        int mediaAcidente;
        int cidadesMenosDe2000Veiculos = 0;

        for (int i = 0; i < totalCidades; i++) {
            System.out.println("Digite o código da cidade: ");
            codigoCidade = scanner.nextInt();
            System.out.println("Digite o total de veículos na cidade: ");
            veiculosPorCidade = scanner.nextInt();
            System.out.println("Digite o total de acidentes com vítimas na cidade: ");
            acidentesPorCidade = scanner.nextInt();

            somaTotalVeiculos += veiculosPorCidade;
            if(veiculosPorCidade < 2000){
                somaTotalAcidentes += acidentesPorCidade;
                cidadesMenosDe2000Veiculos++;
            }

            if (i == 0) {
                menorNumeroAcidentes = acidentesPorCidade;
                cidadeMenosAcidentes = codigoCidade;
                maiorNumeroAcidentes = acidentesPorCidade;
                cidadeMaisAcidentes = codigoCidade;
            }else {
                if (acidentesPorCidade < menorNumeroAcidentes) {
                    menorNumeroAcidentes = acidentesPorCidade;
                    cidadeMenosAcidentes = codigoCidade;
                }

                if (acidentesPorCidade > maiorNumeroAcidentes) {
                    maiorNumeroAcidentes = acidentesPorCidade;
                    cidadeMaisAcidentes = codigoCidade;
                }
            }
        }
        mediaAcidente = somaTotalAcidentes / cidadesMenosDe2000Veiculos;
        mediaVeiculos = somaTotalVeiculos / totalCidades;

        System.out.println("O menor indice de acidentes é da cidade de código " + cidadeMenosAcidentes + " com "
                + menorNumeroAcidentes + " acidentes.");
        System.out.println("O maior indice de acidentes é da cidade de código " + cidadeMaisAcidentes + " com "
                + maiorNumeroAcidentes + " acidentes.");
        System.out.println("A média de veículos nas cinco cidades é: " + mediaVeiculos);
        System.out.println("A média de acidentes nas cidades com menos de 2000 veículos é: " + mediaAcidente);
    }
}
