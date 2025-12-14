package POO.classes.metodosEstaticos;

public class Main {
    static int resultado;

    public static void main(String[] args) {
        somarDoisNumeros(5, 10);
        System.out.println("Soma de dois numeros inteiros: " + resultado);

        somarTresNumeros(5, 10, 15);
        System.out.println("Soma de tres numeros inteiros: " + resultado);

        somarDoisNumerosComPontoFlutuante(5.5, 10.3);
        System.out.println("Soma de dois numeros com ponto flutuante (convertido para inteiro): " + resultado);
    }

    public static void somarDoisNumeros(int a, int b){
        resultado = Calculadora.somar(a, b);
    }

    public static void somarTresNumeros(int a, int b, int c){
        resultado = Calculadora.somar(a, b, c);
    }

    public static void somarDoisNumerosComPontoFlutuante(double a, double b){
        resultado = (int) Calculadora.somar(a, b);
    }

}
