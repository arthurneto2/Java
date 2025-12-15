package exemplos.POO.classes.contador;

public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println("Valor do contador: " + c1.getValor());

        Contador c2 = new Contador();
        System.out.println("Valor do contador: " + c2.getValor());

        Contador.incrementar();
        System.out.println("Valor do contador: " + c1.getValor());
        System.out.println("Valor do contador: " + c2.getValor());

        Contador.decrementar();
        System.out.println("Valor do contador: " + c1.getValor());
        System.out.println("Valor do contador: " + c2.getValor());

    }
}
