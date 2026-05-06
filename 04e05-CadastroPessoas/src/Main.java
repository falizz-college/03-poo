import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        CadastroPessoas cadastro = new CadastroPessoas();
        int escolha = -1;

        while (escolha != 0) {

            System.out.println("==============================");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar nova pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair\n");
            System.out.print("Digite a opção desejada: ");

            escolha = scanner.nextInt();
            if (escolha == 1) {
                cadastro.cadastraPessoa(pessoa);
            } else if (escolha == 2) {
                if (cadastro.getQtdAtual() > 0) {
                    cadastro.imprimeCadastro();
                } else {
                    System.out.println("==============================");
                    System.out.println("Ainda não existem pessoas cadastradas");
                }
            } else if (escolha == 0) {
                System.out.println("Tchau!");
            } else {
                System.out.println("Escolha não identificada!");
            }
        }
    }
}