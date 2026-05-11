package exemplos.queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Paciente implements Comparable<Paciente> {
    String nome;
    String prioridade;

    public Paciente(String nome, String prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }

    @Override
    public int compareTo(Paciente paciente) {
        if (this.prioridade.equals("Vermelho") && paciente.prioridade.equals("Amarelo")) {
            return -1;
        } else if (this.prioridade.equals("Vermelho") && paciente.prioridade.equals("Verde")) {
            return -1;
        } else if (this.prioridade.equals("Amarelo") && paciente.prioridade.equals("Verde")) {
            return -1;
        } else if (this.prioridade.equals(paciente.prioridade)) {
            return 0;
        } else {
            return 1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}



public class ProntoSocorro {

    public static void main(String[] args) {
        Queue<Paciente> filaProntoSocorro = new PriorityQueue<>();
        String[] nomes = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduardo",
                "Fernanda", "Gustavo", "Helena", "Igor", "Juliana",
                "Kleber", "Larissa", "Marcos", "Natália", "Otávio",
                "Patrícia", "Rafael", "Sofia", "Thiago", "Vanessa"
        };

        String[] prioridades = {"Vermelho", "Amarelo", "Verde"};

        for (int i = 0; i < 6; i++) {
            String nome = nomes[i];
            String prioridade = prioridades[i % 3];
            filaProntoSocorro.add(new Paciente(nome, prioridade));
        }

        // Cria um agendador com 1 thread
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Agenda a tarefa: (Tarefa, Delay Inicial, Período, Unidade de Tempo)
        scheduler.scheduleAtFixedRate(() -> {
            Paciente novoPaciente = new Paciente(nomes[(int) (Math.random() * nomes.length)], prioridades[(int) (Math.random() * prioridades.length)]);
            filaProntoSocorro.add(novoPaciente);
            System.out.println("Paciente adicionado: " + novoPaciente);
            System.out.println("Vetor atualizado: " + filaProntoSocorro + "\n");
        }, 0, 4, TimeUnit.SECONDS);

        while (!filaProntoSocorro.isEmpty()) {
            try {
                Thread.sleep(5000); // Simula o tempo de atendimento
                System.out.println("Paciente Atendido: " + filaProntoSocorro.remove() + "\n");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
