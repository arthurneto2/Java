package exemplos.queues;

import java.util.*;

public class DistribuicaoSenhas {
    public static void main(String[] args) {
        Queue<String> senhas = new LinkedList<>();
        Queue<String> senhasPrioritarias = new PriorityQueue<>();

        // Simulando a distribuição de senhas
        senhas.add("Senha 1");
        senhas.add("Senha 2");
        senhas.add("Senha 3");
        senhas.add("Senha 4");
        senhas.add("Senha 5");
        senhas.add("Senha 6");
        senhas.add("Senha 7");
        senhas.add("Senha 8");

        senhasPrioritarias.add("Senha 1P");
        senhasPrioritarias.add("Senha 2P");
        senhasPrioritarias.add("Senha 3P");
        senhasPrioritarias.add("Senha 4P");
        senhasPrioritarias.add("Senha 5P");

        System.out.println("Senhas: " + senhas);
        System.out.println("SenhasPrioritarias: " + senhasPrioritarias + "\n");

        // Atendendo os clientes
        while (!senhas.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                if (senhasPrioritarias.isEmpty()) {
                    break;
                }
                String senhaPrioritariaAtendida = senhasPrioritarias.remove();
                System.out.println("Atendendo prioritário: " + senhaPrioritariaAtendida);
                System.out.println("Senhas restantes nas senhas Prioritarias: " + senhasPrioritarias  + "\n");
            }
            String senhaAtendida = senhas.remove();
            System.out.println("Atendendo: " + senhaAtendida);
            System.out.println("Senhas restantes na senhas: " + senhas + "\n");
        }

        while(!senhasPrioritarias.isEmpty()) {
            System.out.println("Atendendo prioritário: " + senhasPrioritarias.remove());
            System.out.println("Senhas restantes nas senhas Prioritarias: " + senhas);
        }
    }
}
