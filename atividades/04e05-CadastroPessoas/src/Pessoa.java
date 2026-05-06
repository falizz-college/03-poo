import java.util.Scanner;

public abstract class Pessoa {
    public String nome;
    Data nascimento;
    Scanner scanner = new Scanner(System.in);

    public void setPessoa(String nome, Data data){
        this.nome = nome;
        this.nascimento = data;
    }

    public String getNome(){
        return nome;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public abstract void imprimeDados();
}
