package exemplos.POO.classes.conversores;

public class ConversorDeUnidadeDeTempo {
    public static double minutosParaSegundos(double minutos) {
        return minutos * 60;
    }
    public static double horasParaMinutos(double horas) {
        return horas * 60;
    }
    public static double diasParaHoras(double dias) {
        return dias * 24;
    }
    public static double semanasParaDias(double semanas) {
        return semanas * 7;
    }
    public static double mesesParaDias(double meses) {
        return meses * 30;
    }
    public static double anosParaDias(double anos) {
        return anos * 365;
    }
}
