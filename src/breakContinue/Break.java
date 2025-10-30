package breakContinue;

public class Break {
    public static void main(String[] args) {

        // Ao chegar no comando break o loop é encerrado
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
