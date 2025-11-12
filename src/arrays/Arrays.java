package arrays;

public class Arrays {
    public static void main(String[] args) {

        double [] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = i * 1.5;
        }

        for (double nota : notas) {
            System.out.println(nota);
        }

    }
}
