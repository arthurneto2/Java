package loops;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);
        System.out.println("Contador: " + contador);
    }
}
