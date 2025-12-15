package exemplos.POO.classes.contador;

public class Contador {
    private static int valor = 0;

    public Contador() {
        valor++;
    }

    public static void incrementar() {
        valor++;
    }

    public static void decrementar() {
        valor--;
    }

    public int getValor() {
        return valor;
    }
}
