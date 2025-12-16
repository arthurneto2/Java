package exemplos.POO.classes.contaBancaria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULAÇÃO DE CONTAS BANCÁRIAS ===\n");

        // EXEMPLO 1: Conta Bancária Normal
        System.out.println("--- CONTA BANCÁRIA NORMAL ---");
        ContaBancaria contaNormal = new ContaBancaria("João Silva", "001-001", 1000.00);
        System.out.println("Titular: " + contaNormal.getNomeDoTitular());
        System.out.println("Conta: " + contaNormal.getNumeroDaConta());
        System.out.println("Saldo inicial: R$ " + contaNormal.getSaldo());

        // Depósito bem-sucedido
        boolean depositoOk = contaNormal.depositar(500.00);
        System.out.println("\nDepósito de R$ 500.00: " + (depositoOk ? "Sucesso" : "Falha"));
        System.out.println("Saldo atual: R$ " + contaNormal.getSaldo());

        // Saque bem-sucedido
        boolean saqueOk = contaNormal.sacar(300.00);
        System.out.println("\nSaque de R$ 300.00: " + (saqueOk ? "Sucesso" : "Falha"));
        System.out.println("Saldo atual: R$ " + contaNormal.getSaldo());

        // Tentativa de saque acima do saldo (falha)
        boolean saqueFalha = contaNormal.sacar(2000.00);
        System.out.println("\nTentativa de saque de R$ 2000.00: " + (saqueFalha ? "Sucesso" : "Falha"));
        System.out.println("Saldo atual: R$ " + contaNormal.getSaldo());

        // EXEMPLO 2: Conta Especial com Limite
        System.out.println("\n\n--- CONTA ESPECIAL COM LIMITE ---");
        ContaEspecial contaEspecial = new ContaEspecial("Maria Santos", "002-002", 500.00, 1000.00);
        System.out.println("Titular: " + contaEspecial.getNomeDoTitular());
        System.out.println("Conta: " + contaEspecial.getNumeroDaConta());
        System.out.println("Saldo inicial: R$ " + contaEspecial.getSaldo());
        System.out.println("Limite disponível: R$ 1000.00");

        // Saque dentro do saldo
        contaEspecial.sacar(300.00);
        System.out.println("\nSaque de R$ 300.00 (dentro do saldo)");
        System.out.println("Saldo atual: R$ " + contaEspecial.getSaldo());

        // Saque usando parte do limite
        contaEspecial.sacar(400.00);
        System.out.println("\nSaque de R$ 400.00 (utilizando R$ 200.00 do limite)");
        System.out.println("Saldo atual: R$ " + contaEspecial.getSaldo());

        // Depósito que recompõe o limite
        contaEspecial.depositar(500.00);
        System.out.println("\nDepósito de R$ 500.00 (recompondo limite primeiro)");
        System.out.println("Saldo atual: R$ " + contaEspecial.getSaldo());

        // Depósito adicional
        contaEspecial.depositar(300.00);
        System.out.println("\nDepósito de R$ 300.00");
        System.out.println("Saldo atual: R$ " + contaEspecial.getSaldo());

        // EXEMPLO 3: Conta Poupança com Rendimento
        System.out.println("\n\n--- CONTA POUPANÇA COM RENDIMENTO ---");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos Oliveira", "003-003", 1000.00);
        System.out.println("Titular: " + contaPoupanca.getNomeDoTitular());
        System.out.println("Conta: " + contaPoupanca.getNumeroDaConta());
        System.out.println("Saldo inicial: R$ " + contaPoupanca.getSaldo());
        System.out.println("Taxa de juros mensal: 0.5%");
        System.out.println("Dia do rendimento: " + ContaPoupanca.DIA_RENDIMENTO);

        // Simulando 6 meses
        double taxaJuros = 0.5;
        LocalDate dataSimulada = LocalDate.of(2024, 1, 1);

        for (int mes = 1; mes <= 6; mes++) {
            System.out.println("\n--- Mês " + mes + " ---");

            // Simula dias do mês
            for (int dia = 1; dia <= 30; dia++) {
                dataSimulada = LocalDate.of(2024, mes, Math.min(dia, 28));

                // Verifica se é o dia do rendimento
                if (dia == ContaPoupanca.DIA_RENDIMENTO) {
                    double saldoAntes = contaPoupanca.getSaldo();
                    contaPoupanca.calcularRendimento(taxaJuros, dataSimulada);
                    double rendimento = contaPoupanca.getSaldo() - saldoAntes;
                    System.out.println("Data: " + dataSimulada);
                    System.out.println("Rendimento aplicado: R$ " + String.format("%.2f", rendimento));
                    System.out.println("Novo saldo: R$ " + String.format("%.2f", contaPoupanca.getSaldo()));
                }
            }

            // Depósito no meio do mês 3
            if (mes == 3) {
                dataSimulada = LocalDate.of(2024, 3, 15);
                contaPoupanca.depositar(500.00);
                System.out.println("\nDepósito extra em " + dataSimulada + ": R$ 500.00");
                System.out.println("Saldo após depósito: R$ " + String.format("%.2f", contaPoupanca.getSaldo()));
            }

            // Saque no mês 5
            if (mes == 5) {
                dataSimulada = LocalDate.of(2024, 5, 20);
                contaPoupanca.sacar(300.00);
                System.out.println("\nSaque em " + dataSimulada + ": R$ 300.00");
                System.out.println("Saldo após saque: R$ " + String.format("%.2f", contaPoupanca.getSaldo()));
            }
        }

        System.out.println("\n\n=== FIM DA SIMULAÇÃO ===");
    }
}
