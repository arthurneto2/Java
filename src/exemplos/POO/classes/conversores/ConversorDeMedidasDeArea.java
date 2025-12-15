package exemplos.POO.classes.conversores;

public class ConversorDeMedidasDeArea {
    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.7639;
    }

    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929.0304;
    }

    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    public static double acresParaPesQuadrados(double acres) {
        return acres * 43560;
    }
}
