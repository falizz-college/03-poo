public class Cliente extends Pessoa{
    protected int codigo;

    public void Cliente(String nome, Data nascimento){
        System.out.print("Digite o código do cliente: ");
        codigo = scanner.nextInt();
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
        System.out.println("Codigo: " + codigo);
    }
}
