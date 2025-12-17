package exemplos.POO.interfaces.CalculadoraDimencional.impl;

import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoSuperficial;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public abstract double calcularArea();
}
