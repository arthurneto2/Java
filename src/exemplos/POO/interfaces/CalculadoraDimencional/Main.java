package exemplos.POO.interfaces.CalculadoraDimencional;

import exemplos.POO.interfaces.CalculadoraDimencional.impl.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("### Calculadora Dimencional ###");
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica("Paralelepipedo", "Azul");
        Figura3D figura3D = new Figura3D("Cubo", "Vermelho");
        Figura2D figura2D = new Figura2D("Retangulo", "Verde");
        Quadrado quadrado = new Quadrado("Quadrado", "Amarelo", 5);
        Circulo circulo = new Circulo("Circulo", "Roxo", 7);
        Triangulo triangulo = new Triangulo("Triangulo", "Laranja", 4, 6);
        Cubo cubo = new Cubo("Cubo", "Cinza", 3);
        Cilindro cilindro = new Cilindro("Cilindro", "Marrom", 4, 10);
        Piramide piramide = new Piramide("Piramide", "Branco", 6, 9);

        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
        figuras.add(figuraGeometrica);
        figuras.add(figura3D);
        figuras.add(figura2D);
        figuras.add(quadrado);
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(cubo);
        figuras.add(cilindro);
        figuras.add(piramide);

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.toString());
        }
    }
}
