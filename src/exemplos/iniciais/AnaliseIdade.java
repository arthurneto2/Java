package exemplos.iniciais;


public class AnaliseIdade {
    public static void main(String[] args) {
        int [] idades = new int[50];
        int contMaior35 = 0;
        for (int i = 0; i < idades.length; i++) {
            idades[i] = (int) (Math.random() * 100);
        }

        for (int idade : idades) {
            if(idade > 35){
                contMaior35++;
            }
        }

        System.out.println("No total de " + idades.length + " idades, " +
                contMaior35 + " são maiores que 35 anos.");
    }
}
