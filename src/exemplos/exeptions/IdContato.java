package exemplos.exeptions;

public class IdContato {
    private static int contador = 0;

    public static int gerarId() {
        return ++contador;
    }

}
