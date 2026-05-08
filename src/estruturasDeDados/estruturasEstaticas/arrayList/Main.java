package estruturasDeDados.estruturasEstaticas.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(("Elemento " + i));
        }

        System.out.println(lista);
        System.out.println(lista.get(5));
        System.out.println(lista.indexOf("Elemento 7"));

        lista.add(2, "Novo Elemento");
        System.out.println(lista);

        lista.remove("Novo Elemento");
        System.out.println(lista);

        System.out.println(lista.size());


    }
}
