package exemplos.POO.classes.contaCorrente;

public class ContaCorrente {
    int numero;
    double saldo;
    String titular;
    String agencia;
    boolean contaEspecial;

    public ContaCorrente(int numero, double saldo, String titular, String agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.contaEspecial = false;
    }

    public ContaCorrente() {}

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public boolean getContaEspecial() {
        return contaEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }
}
