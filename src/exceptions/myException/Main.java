package exceptions.myException;

public class Main {
    public static void main(String[] args) {

        int[] vet1 = {5,10,3, 49, 51};
        int[] vet2 = {4,5, 9, 7, 2};

        for (int i = 0; i < vet1.length; i++) {
            try {
                if (vet1[i] % vet2[i] != 0) {
                    throw new DoubleDivision();
                }
                System.out.println(vet1[i] + " / " + vet2[i] + " = " + (vet1[i] / vet2[i]));
            } catch (DoubleDivision e) {
                System.out.println(e.toString());
            }
        }
    }
}
