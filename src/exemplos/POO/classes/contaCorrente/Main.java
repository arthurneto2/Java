package exemplos.POO.classes.contaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123456, 1000, "Arthur", "1234");
        System.out.println(conta);

        conta.depositar(1000);
        System.out.println(conta);

        conta.sacar(100);
        System.out.println(conta);
    }
}
