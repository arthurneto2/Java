package estruturasDeDados.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayDinamico<String> lista = new ArrayDinamico<>();

        for (int i = 0; i < 10; i++) {
            lista.adicionar(("Elemento " + i));
        }

        System.out.println(lista);
        System.out.println(lista.busca(5));
        System.out.println(lista.busca("Elemento 7"));

        lista.adicionar(2, "Novo Elemento");
        System.out.println(lista);

        lista.remover("Novo Elemento");
        System.out.println(lista);

    }
}
