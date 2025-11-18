package POO.classes.classeExemploBasico;

public class CriaObjetoCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 10;
        van.numeroPassageiros = 4;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro carro = new Carro("Ford", "Focus", 4, 100, 10);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeCombustivel());
        System.out.println(carro.getConsumoCombustivel());
        System.out.println(carro.getNumeroPassageiros());

        System.out.println(carro);

        carro.setCapacidadeCombustivel(1000);
        System.out.println(carro.getCapacidadeCombustivel());
        carro.exibirAutonomia();
    }
}
