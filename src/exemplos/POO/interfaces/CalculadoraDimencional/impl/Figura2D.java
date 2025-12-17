package exemplos.POO.interfaces.CalculadoraDimencional.impl;

import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoSuperficial;

public class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea(){
        return 0;
    }
}
