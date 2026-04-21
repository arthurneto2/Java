package exemplos.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Alice", "1234-5678"));
        contatos.add(new Contato("Bob", "2345-6789"));
        contatos.add(new Contato("Charlie", "3456-7890"));
        contatos.add(new Contato("Dave", "4567-8901"));
        contatos.add(new Contato("Eve", "5678-9012"));
        contatos.add(new Contato("Frank", "6789-0123"));
        contatos.add(new Contato("Grace", "7890-1234"));
        contatos.add(new Contato("Hank", "8901-2345"));
        contatos.add(new Contato("Irene", "9012-3456"));
        contatos.add(new Contato("John", "0123-4567"));
        contatos.add(new Contato("Karen", "1111-2222"));
        contatos.add(new Contato("Leo", "2222-3333"));
        contatos.add(new Contato("Mona", "3333-4444"));
        contatos.add(new Contato("Nina", "4444-5555"));
        contatos.add(new Contato("Oscar", "5555-6666"));
        contatos.add(new Contato("Paul", "6666-7777"));
        contatos.add(new Contato("Quinn", "7777-8888"));
        contatos.add(new Contato("Rita", "8888-9999"));

        // Exemplo: add em posição específica
        contatos.add(2, new Contato("Zack", "9999-0000"));

        // Exibir lista completa
        System.out.println("Lista completa de contatos (toString):");
        System.out.println(contatos);

        // get e set
        System.out.println("\nContato na posição 2: " + contatos.get(2));
        contatos.set(0, new Contato("Alice Smith", "1234-0000"));
        System.out.println("Após set na posição 0: " + contatos.get(0));

        // contains e indexOf
        Contato procura = new Contato("Mona", "3333-4444");
        System.out.println("\nContém Mona? " + contatos.contains(procura));
        System.out.println("indexOf Mona: " + contatos.indexOf(procura));

        // remover por objeto (remove usa equals — aqui usamos mesma referência não igual de conteúdo)
        // Para demonstrar remoção por objeto, vamos remover por índice e por objeto real da lista
        Contato contatoARemover = contatos.get(4);
        System.out.println("\nRemovendo por referência (posição 4): " + contatoARemover);
        contatos.remove(contatoARemover); // remove por objeto
        System.out.println("Após remoção por objeto: tamanho = " + contatos.size());

        // remover por índice
        Contato removido = contatos.remove(3);
        System.out.println("Removido por índice (3): " + removido + ", tamanho agora = " + contatos.size());

        // Iterando com for-each
        System.out.println("\nIterando com for-each:");
        for (Contato c : contatos) {
            System.out.println(" - " + c);
        }

        // Iterando com Iterator (pode remover durante iteração)
        System.out.println("\nIterando com Iterator e removendo contatos cujo nome começa com 'Q':");
        Iterator<Contato> it = contatos.iterator();
        while (it.hasNext()) {
            Contato c = it.next();
            if (c.getNome().startsWith("Q")) {
                it.remove();
                System.out.println("  removido: " + c);
            }
        }

        System.out.println("\nLista após remoções: " + contatos);

        // size, isEmpty
        System.out.println("Tamanho final: " + contatos.size());
        System.out.println("Vazia? " + contatos.isEmpty());

        // clear
        contatos.clear();
        System.out.println("Após clear(), vazia? " + contatos.isEmpty());
        System.out.println("Tamanho após clear: " + contatos.size());
    }
}
