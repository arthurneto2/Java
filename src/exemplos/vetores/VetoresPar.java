package exemplos.vetores;

public class VetoresPar {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cont = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                cont++;
            }
        }

        System.out.println("O vetor possui " + cont + " numeros pares.");

    }
}
