public class ExceptionPersonalizada extends Exception {

    private int numerador;
    private int denominador;





    public ExceptionPersonalizada(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        int denominador1 = this.denominador;


    }
}
