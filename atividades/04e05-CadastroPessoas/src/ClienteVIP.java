public class ClienteVIP extends Cliente{
    float percentualDesconto;

    @Override
    public void Cliente(String nome, Data nascimento){
        System.out.print("Digite o código do cliente: ");
        codigo = scanner.nextInt();
        System.out.print("Digite o percentual de desconto do Cliente VIP: ");
        percentualDesconto = scanner.nextFloat();
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
        System.out.println("Codigo: " + codigo);
        System.out.println("Desconto: " + (percentualDesconto * 100) + "%");
    }

    public float calcularDesconto(float preco){
        return preco * percentualDesconto;
    }
}
