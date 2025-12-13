package exemplos.POO.classes.contaCorrente;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(123456, "João Silva",
                "001", 500.0, false);


        // Teste 1: Depósito válido
        System.out.println("=== Teste 1: Depósito válido ===");
        if (conta1.depositar(100)) {
            System.out.println("Saldo após depósito de 100: " + conta1.getSaldo());
        } else {
            System.out.println("Depósito inválido");
        }

        // Teste 2: Depósito com valor zero
        System.out.println("\n=== Teste 2: Depósito com valor zero ===");
        if (conta1.depositar(0)) {
            System.out.println("Depósito aceito. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Depósito inválido (valor zero)");
        }

        // Teste 3: Depósito com valor negativo
        System.out.println("\n=== Teste 3: Depósito com valor negativo ===");
        if (conta1.depositar(-50)) {
            System.out.println("Depósito aceito. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Depósito inválido (valor negativo)");
        }

        // Teste 4: Saque válido com saldo suficiente
        System.out.println("\n=== Teste 4: Saque válido com saldo suficiente ===");
        if (conta1.sacar(50)) {
            System.out.println("Saque de 50 realizado. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Saque inválido");
        }

        // Teste 5: Saque com saldo insuficiente (conta normal)
        System.out.println("\n=== Teste 5: Saque com saldo insuficiente (conta normal) ===");
        if (conta1.sacar(100)) {
            System.out.println("Saque realizado. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Saque inválido (saldo insuficiente)");
        }

        // Teste 6: Conta especial - Saque usando cheque especial
        System.out.println("\n=== Teste 6: Conta especial - Saque usando cheque especial ===");
        ContaCorrente conta2 = new ContaCorrente(789012, "Maria Santos",
                "002", 500.0, true);
        conta2.depositar(100);
        System.out.println("Saldo inicial: " + conta2.getSaldo());
        if (conta2.sacar(400)) {
            System.out.println("Saque de 400 realizado. Saldo: " + conta2.getSaldo());
            System.out.println("Cheque especial ativo: " + conta2.isChequeEspecial());
        } else {
            System.out.println("Saque inválido");
        }

        // Teste 7: Saque excedendo limite do cheque especial
        System.out.println("\n=== Teste 7: Saque excedendo limite do cheque especial ===");
        if (conta2.sacar(300)) {
            System.out.println("Saque realizado. Saldo: " + conta2.getSaldo());
        } else {
            System.out.println("Saque inválido (excede limite do cheque especial)");
        }

        // Teste 8: Depósito após usar cheque especial
        System.out.println("\n=== Teste 8: Depósito após usar cheque especial ===");
        if (conta2.depositar(200)) {
            System.out.println("Depósito de 200 realizado. Saldo: " + conta2.getSaldo());
            System.out.println("Cheque especial ativo: " + conta2.isChequeEspecial());
        } else {
            System.out.println("Depósito inválido");
        }

        // Teste 9: Saque com valor zero
        System.out.println("\n=== Teste 9: Saque com valor zero ===");
        if (conta1.sacar(0)) {
            System.out.println("Saque aceito. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Saque inválido (valor zero)");
        }

        // Teste 10: Saque com valor negativo
        System.out.println("\n=== Teste 10: Saque com valor negativo ===");
        if (conta1.sacar(-20)) {
            System.out.println("Saque aceito. Saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Saque inválido (valor negativo)");
        }
    }
}
