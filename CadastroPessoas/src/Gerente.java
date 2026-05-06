public class Gerente extends Funcionario{
    private String area;

    public String getArea(){
        return area;
    }

    @Override
    public void Funcionario(String nome, Data nascimento){
        System.out.print("Digite o salário do funcionário: ");
        salario = scanner.nextFloat();
        System.out.print("Digite a área do Gerente: ");
        area = scanner.next();
    }

    @Override
    public float calculaImposto(){
        return getSalario() * 0.05f;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
        System.out.println("Área: " + getArea());
        System.out.println("Salário: " + getSalario());
        System.out.println("Imposto sob salário: " + calculaImposto());
    }
}
