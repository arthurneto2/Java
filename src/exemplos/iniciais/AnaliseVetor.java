package exemplos.iniciais;

public class AnaliseVetor {
    public static void main(String[] args) {
        int [] vetor = new int[50];
        int somaMenores15 = 0;
        int quantidadeIgual15 = 0;
        int quantidadeMaior15 = 0;
        int somaMaior15 = 0;


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        for (int numero:vetor){
            if(numero < 15){
                somaMenores15 += numero;
            } else if (numero == 15){
                quantidadeIgual15++;
            } else {
                quantidadeMaior15++;
                somaMaior15 += numero;
            }
        }

        System.out.println("A soma dos valores menores que 15 é : " + somaMenores15);
        System.out.println("A quantidade de valores iguais a 15 é : " + quantidadeIgual15);
        System.out.println("A media dos valores maiores que 15 é : " + somaMaior15 / quantidadeMaior15);
    }
}
