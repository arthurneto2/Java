package exemplos.POO.classes.calculadora;

public class Calculadora {
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static double potencia(double base, double expoente) {
        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int fatorial(int a){
        if (a == 1) {
            return 1;
        }
        return a * fatorial(a - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int somatorio(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + somatorio(n - 1);
        }
    }

}
