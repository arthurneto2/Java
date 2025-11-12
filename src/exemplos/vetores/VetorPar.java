package exemplos.vetores;

public class VetorPar {
    public static void main(String[] args) {
        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.round(Math.random() * 10);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero  + " -> ");
            }else {
                System.out.println("O vetor possui valores impares.");
                break;
            }
        }
    }
}
