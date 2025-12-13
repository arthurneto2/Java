package exemplos.POO.classes.contaCorrente;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private String titular;
    private String agencia;
    private boolean contaEspecial;
    private boolean chequeEspecial;
    private double limiteChequeEspecial;
    private double valorChequeEspecialDisponivel;

    public ContaCorrente(int numero, String titular, String agencia, double limiteChequeEspecial,
                         boolean contaEspecial) {
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;
        this.agencia = agencia;
        this.contaEspecial = contaEspecial;
        this.chequeEspecial = false;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.valorChequeEspecialDisponivel = limiteChequeEspecial;
    }

    public ContaCorrente() {}

    public boolean sacar(double valor) {
        double diferenca = this.saldo - valor;
        if (valor <= 0) {
            return false;
        }
        if(diferenca > 0){
            saldo = diferenca;
            return true;

        }else{
            if (!contaEspecial) {
                return false;
            }else{
                if (diferenca < -valorChequeEspecialDisponivel) {
                    return false;
                }else {
                    this.chequeEspecial = true;
                    saldo = 0;
                    valorChequeEspecialDisponivel += diferenca;
                    return true;
                }
            }
        }
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        if (chequeEspecial){
            double excedenteChequeEspecial = valorChequeEspecialDisponivel + valor;
            if (excedenteChequeEspecial > limiteChequeEspecial) {
                saldo += excedenteChequeEspecial - limiteChequeEspecial;
                valorChequeEspecialDisponivel = limiteChequeEspecial;
                chequeEspecial = false;
            } else {
                valorChequeEspecialDisponivel += valor;
            }
        } else {
            saldo += valor;
        }
        return true;
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

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public boolean isChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
