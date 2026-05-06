public class PessoaService {

    public void contagemGerente(int contador) throws QuantidadeExcedidaException {
        if (contador > 1) { // Limite para Gerente
            throw new QuantidadeExcedidaException("Gerente");
        }
    }

    public void contagemFuncionario(int contador) throws QuantidadeExcedidaException {
        if (contador > 7) { // Limite para Funcionários
            throw new QuantidadeExcedidaException("Funcionários");
        }
    }
}
