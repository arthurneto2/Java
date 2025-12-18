package exceptions.myException;

public class DoubleDivision extends Exception{
    public DoubleDivision(){
        super("Resultado da divisao não é um número inteiro");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
