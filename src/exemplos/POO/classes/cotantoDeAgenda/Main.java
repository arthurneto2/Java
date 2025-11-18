package exemplos.POO.classes.cotantoDeAgenda;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Arthur", "123456789", "");
        System.out.println(contato);

        Contato contato2 = new Contato();
        contato2.setNome("Joao");
        contato2.setTelefone("987654321");
        contato2.setEmail("");
        System.out.println(contato2);
    }
}
