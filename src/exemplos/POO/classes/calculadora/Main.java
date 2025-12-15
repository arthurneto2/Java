package exemplos.POO.classes.calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testes da Calculadora ===\n");

        // Testes de Soma
        System.out.println("--- Testes de Soma ---");
        System.out.println("5 + 3 = " + Calculadora.soma(5, 3) + " (Esperado: 8)");
        System.out.println("10.5 + 2.5 = " + Calculadora.soma(10.5, 2.5) + " (Esperado: 13.0)");
        System.out.println("-5 + 3 = " + Calculadora.soma(-5, 3) + " (Esperado: -2)");
        System.out.println("0 + 0 = " + Calculadora.soma(0, 0) + " (Esperado: 0)\n");

        // Testes de Subtração
        System.out.println("--- Testes de Subtração ---");
        System.out.println("10 - 3 = " + Calculadora.subtracao(10, 3) + " (Esperado: 7)");
        System.out.println("5.5 - 2.5 = " + Calculadora.subtracao(5.5, 2.5) + " (Esperado: 3.0)");
        System.out.println("3 - 5 = " + Calculadora.subtracao(3, 5) + " (Esperado: -2)");
        System.out.println("0 - 0 = " + Calculadora.subtracao(0, 0) + " (Esperado: 0)\n");

        // Testes de Multiplicação
        System.out.println("--- Testes de Multiplicação ---");
        System.out.println("5 * 3 = " + Calculadora.multiplicacao(5, 3) + " (Esperado: 15)");
        System.out.println("2.5 * 4 = " + Calculadora.multiplicacao(2.5, 4) + " (Esperado: 10.0)");
        System.out.println("-5 * 3 = " + Calculadora.multiplicacao(-5, 3) + " (Esperado: -15)");
        System.out.println("0 * 10 = " + Calculadora.multiplicacao(0, 10) + " (Esperado: 0)\n");

        // Testes de Divisão
        System.out.println("--- Testes de Divisão ---");
        System.out.println("10 / 2 = " + Calculadora.divisao(10, 2) + " (Esperado: 5.0)");
        System.out.println("15 / 4 = " + Calculadora.divisao(15, 4) + " (Esperado: 3.75)");
        System.out.println("-10 / 2 = " + Calculadora.divisao(-10, 2) + " (Esperado: -5.0)");
        try {
            System.out.println("10 / 0 = " + Calculadora.divisao(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("10 / 0 = Erro: " + e.getMessage() + " (Esperado: Exceção)");
        }
        System.out.println();

        // Testes de Potência
        System.out.println("--- Testes de Potência ---");
        System.out.println("2 ^ 3 = " + Calculadora.potencia(2, 3) + " (Esperado: 8)");
        System.out.println("5 ^ 2 = " + Calculadora.potencia(5, 2) + " (Esperado: 25)");
        System.out.println("10 ^ 0 = " + Calculadora.potencia(10, 0) + " (Esperado: 1)");
        System.out.println("3 ^ 4 = " + Calculadora.potencia(3, 4) + " (Esperado: 81)");
        System.out.println();

        // Testes de Fatorial
        System.out.println("--- Testes de Fatorial ---");
        System.out.println("5! = " + Calculadora.fatorial(5) + " (Esperado: 120)");
        System.out.println("3! = " + Calculadora.fatorial(3) + " (Esperado: 6)");
        System.out.println("1! = " + Calculadora.fatorial(1) + " (Esperado: 1)");
        System.out.println("7! = " + Calculadora.fatorial(7) + " (Esperado: 5040)");
        System.out.println("10! = " + Calculadora.fatorial(10) + " (Esperado: 3628800)");
        System.out.println();

        // Testes de Fibonacci
        System.out.println("--- Testes de Fibonacci ---");
        System.out.println("fibonacci(0) = " + Calculadora.fibonacci(0) + " (Esperado: 0)");
        System.out.println("fibonacci(1) = " + Calculadora.fibonacci(1) + " (Esperado: 1)");
        System.out.println("fibonacci(2) = " + Calculadora.fibonacci(2) + " (Esperado: 1)");
        System.out.println("fibonacci(5) = " + Calculadora.fibonacci(5) + " (Esperado: 5)");
        System.out.println("fibonacci(7) = " + Calculadora.fibonacci(7) + " (Esperado: 13)");
        System.out.println("fibonacci(10) = " + Calculadora.fibonacci(10) + " (Esperado: 55)");
        System.out.println();

        // Testes de Somatório
        System.out.println("--- Testes de Somatório ---");
        System.out.println("somatorio(0) = " + Calculadora.somatorio(0) + " (Esperado: 0)");
        System.out.println("somatorio(1) = " + Calculadora.somatorio(1) + " (Esperado: 1)");
        System.out.println("somatorio(5) = " + Calculadora.somatorio(5) + " (Esperado: 15)");
        System.out.println("somatorio(10) = " + Calculadora.somatorio(10) + " (Esperado: 55)");
        System.out.println("somatorio(100) = " + Calculadora.somatorio(100) + " (Esperado: 5050)");


    }
}
