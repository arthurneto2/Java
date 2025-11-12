package matriz;

public class Matriz {
    public static void main(String[] args) {
        int [][] notasAlunos = new int[3][4];

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                notasAlunos[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int nota : notasAlunos[i]) {
                System.out.println("    nota: " + nota);
            }
        }
    }
}
