package exemplos.POO.classes.conversores;

public class ConversorDeUnidadeDeVolume {
    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000;
    }

    public static double metrosCubicosParaLitros(double metrosCubicos) {
        return metrosCubicos * 1000;
    }

    public static double metrosCubicosParaPesCubicos(double metrosCubicos) {
        return metrosCubicos * 35.3147;
    }

    public static double galaoAmericanoParaPolegadasCubicas(double galaoAmericano) {
        return galaoAmericano * 231;
    }

    public static double galaoAmericanoParaLitros(double galaoAmericano) {
        return galaoAmericano * 3.78541;
    }

}
