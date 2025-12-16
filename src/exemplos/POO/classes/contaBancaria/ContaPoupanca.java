package exemplos.POO.classes.contaBancaria;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria{
    public static final int DIA_RENDIMENTO = 5;

    public ContaPoupanca(String nomeDoTitular, String numeroDaConta, double saldoInicial) {
        super(nomeDoTitular, numeroDaConta, saldoInicial);
    }

    public void calcularRendimento(double taxaDeJuros, LocalDate dataAtual) {
        if (dataAtual.getDayOfMonth() != DIA_RENDIMENTO) {
            return;
        }
        double rendimento = getSaldo() * taxaDeJuros / 100;
        depositar(rendimento);
    }
}
