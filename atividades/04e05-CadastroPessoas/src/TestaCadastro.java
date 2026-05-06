import java.util.ArrayList;
import java.util.Scanner;

public class TestaCadastro {

    PessoaService testeFuncionario = new PessoaService();
    PessoaService testeGerente = new PessoaService();
    int contadorFuncionario = 0;
    int contadorGerente = 0;
    Scanner scanner = new Scanner(System.in);

    public void lerPessoa(ArrayList<Pessoa> pessoas){
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();
        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mes do nascimento: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano do nascimento: ");
        int ano = scanner.nextInt();
        Data nascimento = new Data();
        nascimento.setData(dia, mes, ano);

        criarPessoa(pessoas, nome, nascimento);
    }

    public void criarPessoa(ArrayList<Pessoa> pessoas, String nome, Data nascimento){
        System.out.println("Tipo de cadatro:\n1 - Cliente\n2 - Clietnte VIP\n3 - Funcionario\n4 - Gerente");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            Cliente pessoa = new Cliente();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Cliente(nome, nascimento);
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else if (escolha == 2){
            ClienteVIP pessoa = new ClienteVIP();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Cliente(nome, nascimento);
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        }else if (escolha == 3){
            contadorFuncionario++;
            testeFuncionario.contagemFuncionario(contadorFuncionario);
            Funcionario pessoa = new Funcionario();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Funcionario(nome, nascimento);
            pessoa.calculaImposto();
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else if (escolha == 4){
            contadorGerente++;
            testeGerente.contagemGerente(contadorGerente);
            Gerente pessoa = new Gerente();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Funcionario(nome, nascimento);
            pessoa.calculaImposto();
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else {
            System.out.println("Opção inválida");
            criarPessoa(pessoas, nome, nascimento);
        }
    }
}