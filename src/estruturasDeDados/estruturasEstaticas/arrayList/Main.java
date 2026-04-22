package estruturasDeDados.estruturasEstaticas.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(("Elemento " + i));
        }

        System.out.println(lista);
        System.out.println(lista.busca(5));
        System.out.println(lista.busca("Elemento 7"));

        lista.adicionar(2, "Novo Elemento");
        System.out.println(lista);

        lista.remover("Novo Elemento");
        System.out.println(lista);

        System.out.println(lista.size());


    }
}
