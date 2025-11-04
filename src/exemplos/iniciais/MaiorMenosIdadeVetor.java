package exemplos.iniciais;

public class MaiorMenosIdadeVetor {
    public static void main(String[] args) {
        int [] idades = new int[50];
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = (int) (Math.random() * 100);
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indiceMaior = i;
            }
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indiceMenor = i;
            }
        }

        System.out.println("Maior idade: " + maiorIdade + " na posição " + indiceMaior);
        System.out.println("Menor idade: " + menorIdade + " na posição " + indiceMenor);
    }
}
