package exemplos.POO.interfaces.CalculadoraDimencional.impl;

import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoSuperficial;
import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoVolumetrica;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }
    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularVolume();
}
