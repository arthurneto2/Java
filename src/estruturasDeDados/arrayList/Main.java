package estruturasDeDados.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayDinamico lista = new ArrayDinamico();

        for (int i = 0; i < 10; i++) {
            lista.adicionar(("Elemento " + i));
        }

        System.out.println(lista.toString());

    }
}
