public class QuantidadeExcedidaException extends RuntimeException {
    public QuantidadeExcedidaException(String message) {
        super("Quantidade de " + message + " excedida");
    }
}
