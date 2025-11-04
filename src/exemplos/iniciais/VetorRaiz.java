package exemplos.iniciais;

public class VetorRaiz {
    public static void main(String[] args) {
        double[] raizes = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        double[] resultados = new double[raizes.length];

        for (int i = 0; i < raizes.length; i++) {
            resultados[i] = Math.sqrt(raizes[i]);
        }

        for (double resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
