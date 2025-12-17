package exemplos.POO.classes.zoologico;

public class Main {
    public static void main(String[] args) {
        // Criando objeto Animal
        Animal animal = new Animal("Camelo", 150, "Amarelo", "Terra", 2.0);
        System.out.println(animal.toString());
        System.out.println("---------------------------------------\n");

        // Criando objeto Mamifero
        Mamifero mamifero = new Mamifero("Urso-do-canadá", 180, "Vermelho", "Terra", 0.5, "Mel");
        System.out.println(mamifero.toString());
        System.out.println("---------------------------------------\n");

        // Criando objeto peixe
        peixe peixe = new peixe("Tubarão", 300, 1.5, "Barbatanas e cauda");
        System.out.println(peixe.toString());
        System.out.println("---------------------------------------\n");
    }
}
