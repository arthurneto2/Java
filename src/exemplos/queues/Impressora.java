package exemplos.queues;


import java.util.LinkedList;
import java.util.Queue;

class Documents {
    private String nome;
    private int quantidadeFolhas;

    public Documents(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(int quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }
}

public class Impressora {
    public static void main(String[] args) {
        Queue<Documents> filaImpressao = getFilaImpressao();

        while (!filaImpressao.isEmpty()) {
            Documents documento = filaImpressao.poll();
            System.out.println("Imprimindo " + documento.getNome() + "...");
            try {
                Thread.sleep(documento.getQuantidadeFolhas() * 100L);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Todos os documentos foram impressos.");
    }

    private static Queue<Documents> getFilaImpressao() {
        Queue<Documents> filaImpressao = new LinkedList<>();

        Documents documents = new Documents("Documento", 5);
        Documents documents2 = new Documents("Documento2", 15);
        Documents documents3 = new Documents("Documento3", 25);
        Documents documents4 = new Documents("Documento4", 30);
        Documents documents5 = new Documents("Documento5", 35);
        Documents documents6 = new Documents("Documento6", 40);

        filaImpressao.add(documents);
        filaImpressao.add(documents2);
        filaImpressao.add(documents3);
        filaImpressao.add(documents4);
        filaImpressao.add(documents5);
        filaImpressao.add(documents6);
        return filaImpressao;
    }
}
