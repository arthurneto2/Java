package exemplos.iniciais;

public class Codigo {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        char [] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorA[i] = 'd';
            }else {
                vetorB[i] = 'e';
            }
        }

        for (int numero : vetorA) {
            System.out.print(numero + " -> ");
        }
        System.out.println("Menssagem");

        for (char letra : vetorB) {
            System.out.print(letra + " -> ");
        }
        System.out.println("Codigo");

    }
}
