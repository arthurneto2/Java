package estruturasDeDados.matriz;

public class Matriz3D {
    public static void main(String[] args) {
        int [][][] cuboNotas = new int[2][3][4];

        for (int i = 0; i < cuboNotas.length; i++) {
            for (int j = 0; j < cuboNotas[i].length; j++) {
                for (int k = 0; k < cuboNotas[i][j].length; k++) {
                    cuboNotas[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int i = 0; i < cuboNotas.length; i++) {
            System.out.println();
            System.out.println("Turma " + (i + 1));
            for (int j = 0; j < cuboNotas[i].length; j++) {
                System.out.println(" Aluno " + (j + 1));
                for (int nota : cuboNotas[i][j]) {
                    System.out.println("    nota: " + nota);
                }
            }
        }
    }
}
