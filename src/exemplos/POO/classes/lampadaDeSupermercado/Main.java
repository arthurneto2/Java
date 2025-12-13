package exemplos.POO.classes.lampadaDeSupermercado;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(123456, "Lampada Supermercado", "Vermelho", 100, 1000);
        System.out.println(lampada);

        lampada.ligar();
        System.out.println("Lampada ligada: " + lampada.isLigada());

        lampada.desligar();
        System.out.println("Lampada desligada: " + lampada.isLigada());
    }
}
