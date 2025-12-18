package exceptions.logs;

public class Exception {
    public static void main(String[] args) {
        int[] vet1 = {8, 4, 49, 6};
        int[] vet2 = {4, 0, 7 , 0};

        for (int i = 0; i < vet2.length; i++){
            try{
                System.out.println(vet1[i] / vet2[i]);
            }catch (java.lang.Exception e){
                e.printStackTrace();
            }
        }
    }
}
