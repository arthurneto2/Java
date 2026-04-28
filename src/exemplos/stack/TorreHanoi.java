package exemplos.stack;

import estruturasDeDados.estruturasEstaticas.pilha.Stack;

public class TorreHanoi {
    public static void main(String[] args) {
        Stack<Integer> torreA = new Stack<>();
        Stack<Integer> torreB = new Stack<>();
        Stack<Integer> torreC = new Stack<>();

        // Inicializa a torre A com os discos (maior número representa o maior disco)
        torreA.push(3); // Disco maior
        torreA.push(2); // Disco médio
        torreA.push(1); // Disco menor

        System.out.println("Torre A: " + torreA);
        System.out.println("Torre B: " + torreB);
        System.out.println("Torre C: " + torreC);

        // Move os discos da torre A para a torre C usando a torre B como auxiliar
        moverDiscos(3, torreA, torreC, torreB);

    }

    private static void moverDiscos(int i, Stack<Integer> torreA, Stack<Integer> torreC, Stack<Integer> torreB) {
        if (i == 1) {
            int disco = torreA.pop();
            torreC.push(disco);
            System.out.println("Move disco " + disco + " da torre A para a torre C");
        } else {
            moverDiscos(i - 1, torreA, torreB, torreC); // Move os discos menores para a torre B
            int disco = torreA.pop();
            torreC.push(disco); // Move o maior disco para a torre C
            System.out.println("Move disco " + disco + " da torre A para a torre C");
            moverDiscos(i - 1, torreB, torreC, torreA); // Move os discos menores da torre B para a torre C
        }
    }
}
