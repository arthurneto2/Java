package exemplos.POO.interfaces.CalculadoraDimencional.impl;

import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoSuperficial;
import exemplos.POO.interfaces.CalculadoraDimencional.DimensaoVolumetrica;

public  class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public  double calcularArea(){
        return 0;
    }

    @Override
    public  double calcularVolume(){
        return 0;
    }
}
