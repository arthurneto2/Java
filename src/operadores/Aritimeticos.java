package operadores;

public class Aritimeticos {
    public static void main(String[] args) {

        //Contas
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado -= 1;
        System.out.println(resultado);

        resultado *= 10;
        System.out.println(resultado);

        resultado /= 10;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        // Resto da divisão entre resultado e 2
        resultado %= 2;
        System.out.println(resultado);

        //Contatenação
        String primeiraString = "ola ";
        String segundaString = "Mundo";
        String frase = primeiraString + segundaString;
        System.out.println(frase);

        System.out.println(resultado++);
        //mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;



        System.out.println(++resultado);
        //mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}
