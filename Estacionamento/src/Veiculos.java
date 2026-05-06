import java.util.Scanner;

public abstract class Veiculos {

    String tipo;
    String tipoComplemento;
    double peso;
    int preco;
    Scanner scanner = new Scanner(System.in);

    public abstract void setTipo();

    public abstract void setTipoComplemento();

    public void setPeso(){
        System.out.println("==================================================");
        System.out.print("Digite o peso do(a) " + tipo + ": ");
        peso = scanner.nextDouble();
        if (peso < 0){
            System.out.println("Peso inválido");
            setPeso();
        }
        if (peso > 6000){
            System.out.println("Peso máximo excedido!");
            System.out.println(tipo + " não aceito(a) no estacionamento");
        }
    }

    public void setPreco(){
        System.out.println("==================================================");
        System.out.println("Valor por hora: ");
        System.out.println(tipo + " " + tipoComplemento + ": R$" + preco + ",00");
    }
}
