import java.util.Scanner;

public class Funcionario extends Pessoa{
    protected float salario;

    public float getSalario(){
        return salario;
    }

    public void Funcionario(String nome, Data nascimento){
        System.out.print("Digite o salário do funcionário: ");
        salario = scanner.nextFloat();
    }

    public float calculaImposto(){
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
        System.out.println("Salário: " + salario);
        System.out.println("Imposto sob salário: " + calculaImposto());
    }

}
