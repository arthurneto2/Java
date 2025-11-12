package exemplos.vetores;

import java.util.Scanner;

public class Detetive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveAnswers = 0;
        String[] questions = {
                "Telefonou para a vítima? (s/n)",
                "Esteve no local do crime? (s/n)",
                "Mora perto da vítima? (s/n)",
                "Devia para a vítima? (s/n)",
                "Já trabalhou com a vítima? (s/n)"
        };

        for (String question : questions) {
            System.out.println(question);
            String answer = scanner.next().trim().toLowerCase();
            if (answer.equals("s")) {
                positiveAnswers++;
            }
        }

        String classification = switch (positiveAnswers) {
            case 2 -> "Suspeita";
            case 3, 4 -> "Cúmplice";
            case 5 -> "Assassino";
            default -> "Inocente";
        };

        System.out.println("Classificação: " + classification);
    }
}
