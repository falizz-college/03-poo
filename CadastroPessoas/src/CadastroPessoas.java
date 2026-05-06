import java.util.ArrayList;

public class CadastroPessoas {

    private int qtdAtual = 0;
    private ArrayList<Pessoa> pessoas;
    TestaCadastro teste = new TestaCadastro();

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    public int getQtdAtual(){
        return qtdAtual;
    }

    public void cadastraPessoa(Pessoa pessoa) {
        try {
            teste.lerPessoa(pessoas);
            qtdAtual++;
        } catch (QuantidadeExcedidaException e) {
            System.out.println(e.getMessage());
        }
    }


    public void imprimeCadastro(){
        int i = 1;
        for (Pessoa pessoa : pessoas){
            System.out.println(i + " - " + pessoa.getNome());
            i++;
        }
    }

}