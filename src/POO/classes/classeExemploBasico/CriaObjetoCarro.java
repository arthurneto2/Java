package POO.classes.classeExemploBasico;

public class CriaObjetoCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Ducato");
        van.setCapacidadeCombustivel(100);
        van.setConsumoCombustivel(10);
        van.setNumeroPassageiros(4);

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());

        Carro carro = new Carro("Ford", "Focus", 4, 100, 10);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeCombustivel());
        System.out.println(carro.getConsumoCombustivel());
        System.out.println(carro.getNumeroPassageiros());

        System.out.println(carro);

        carro.setCapacidadeCombustivel(1000);
        System.out.println(carro.getCapacidadeCombustivel());
        System.out.println(carro.calculaAutonomia());

        Carro carro2 = new Carro("Chevrolet", "Onix");
        System.out.println(carro2);
    }
}
