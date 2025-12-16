package exemplos.POO.classes.contaBancaria;

public class ContaEspecial extends ContaBancaria {
    private double limite;
    private double limiteUtilizado;

    public ContaEspecial(String nomeDoTitular, String numeroDaConta, double saldoInicial, double limite) {
        super(nomeDoTitular, numeroDaConta, saldoInicial);
        this.limite = limite;
        this.limiteUtilizado = 0;
    }

    private void usarLimite(double valor) {
        if (valor > 0 && (limiteUtilizado + valor) <= limite) {
            limiteUtilizado += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor < 0) {
            if (valor < getSaldo()){
                setSaldo(getSaldo() - valor);
                return true;
            }else {
                double limiteDisponivel = limite - limiteUtilizado;
                double valorADescontarNoLimite = valor - getSaldo();
                if (limiteDisponivel > valorADescontarNoLimite){
                    usarLimite(valorADescontarNoLimite);
                    setSaldo(0);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            if (limiteUtilizado > 0) {
                if (valor >= limiteUtilizado) {
                    valor -= limiteUtilizado;
                    limiteUtilizado = 0;
                } else {
                    limiteUtilizado -= valor;
                    valor = 0;
                }
            }
            setSaldo(getSaldo() + valor);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }
}
