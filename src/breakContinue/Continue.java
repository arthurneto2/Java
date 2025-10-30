package breakContinue;

public class Continue {
    public static void main(String[] args) {

        //Pula somente o ciclo atual do loop
        for (int i = 1; i < 25; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
