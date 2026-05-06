public class Main {
    public static void main(String[] args) {

        // Teste para produtos. As taxas aplicadas em produtos são IPI e ICMS

        Taxar tipoProduto = new Taxar("produto", 250.00);
        tipoProduto.calculartaxas();

        // Teste para serviços. As taxas aplicadas em serviços são ISS e ICMS

        Taxar tipoServico = new Taxar("serviço", 850.00);
        tipoServico.calculartaxas();

    }
}