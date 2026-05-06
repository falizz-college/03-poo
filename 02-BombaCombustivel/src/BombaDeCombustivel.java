import java.util.Scanner;
import java.text.DecimalFormat;

public class BombaDeCombustivel {

    Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String tipoCombustivel = "Etanol";
    double valorLitro = 5.78F;
    double quantidadeCombustivel = 1000;
    double valorTotalReais = 0;
    double valorTotalLitros = 0;

    public BombaDeCombustivel(){
        statusBomba();
        operacoes();
    }

    public void statusBomba(){
        System.out.println("\n==============================\n");
        System.out.println("Valores:");
        System.out.println("Tipo do Combustível: " + tipoCombustivel);
        System.out.println("Valor do Litro: " + df.format(valorLitro));
        System.out.println("Quantidade de combustível na bomba: " + df.format(quantidadeCombustivel));
        System.out.println("Valor total abastecido: " + df.format(valorTotalLitros) + " L e R$ " + df.format(valorTotalReais));
    }

    public void operacoes(){
        System.out.println("\n==============================\n");
        System.out.println("1 - Abastecer por valor");
        System.out.println("2 - Abastecer por litro");
        System.out.println("3 - Alterar valor do(a) " + tipoCombustivel);
        System.out.println("4 - Alterar tipo do combustível");
        System.out.println("5 - Alterar quantidade de combustível existente na bomba");
        System.out.println("6- Status da bomba");
        System.out.println("0 - Sair");
        System.out.println("Digite a operação que deseja: ");
        int escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                abastecerPorValor();
                operacoes();
            case 2:
                abastecerPorLitro();
                operacoes();
            case 3:
                alterarValor();
                operacoes();
            case 4:
                alterarCombustivel();
                operacoes();
            case 5:
                alterarQuantidadeCombustivel();
                operacoes();
            case 6:
                statusBomba();
                operacoes();
            case 0:
                return;
            default:
                System.out.println("Opção não reconhecida");
                operacoes();
        }
    }

    public void abastecerPorValor(){
        System.out.println("\n==============================\n");
        if(valorLitro <= 0){
            System.out.println("Valor do(a) " + tipoCombustivel + " inválido");
            alterarValor();
        }
        System.out.println("Digite o valor a ser abastecido: ");
        double valor = scanner.nextFloat();
        double litros = valor / valorLitro;
        valorTotalLitros += litros;
        valorTotalReais += valor;
        if(quantidadeCombustivel < litros){
            System.out.println("Quantidade de combustível insuficiente");
            System.out.println("Quantidade de combustível na bomba: " + df.format(quantidadeCombustivel));
            abastecerPorValor();
        }
        System.out.println(df.format(litros) + " Litros de " + tipoCombustivel);
        quantidadeCombustivel -= litros;
    }

    public void abastecerPorLitro(){
        System.out.println("\n==============================\n");
        if(valorLitro <= 0){
            System.out.println("Valor do(a) " + tipoCombustivel + " inválido");
            alterarValor();
        }
        System.out.println("Digite quantos Litros de " + tipoCombustivel + " deseja: ");
        double litros = scanner.nextFloat();
        if(quantidadeCombustivel < litros){
            System.out.println("Quantidade de combustível insuficiente");
            System.out.println("Quantidade de combustível na bomba: " + df.format(quantidadeCombustivel));
            abastecerPorLitro();
        }
        double valorAPagar = litros * valorLitro;
        valorTotalLitros += litros;
        valorTotalReais += valorAPagar;
        System.out.println("O valor a ser pago é de R$ " + df.format(valorAPagar));
        quantidadeCombustivel -= litros;
    }

    public void alterarValor(){
        System.out.println("\n==============================\n");
        System.out.println("Digite o novo valor do(a) " + tipoCombustivel);
        valorLitro = scanner.nextFloat();
        if (valorLitro <= 0){
            System.out.println("Valor inválido");
            alterarValor();
        }
        System.out.println("Valor alterado com sucesso!");
        System.out.println("Valor do combustível: R$ " + df.format(valorLitro));
    }

    public void alterarCombustivel(){
        System.out.println("\n==============================\n");
        System.out.println("Digite o combustivel que deseja: ");
        System.out.println("Opções:\nGasolina\nAditivada\nEtanol\nDiesel");
        tipoCombustivel = scanner.next();
        switch (tipoCombustivel.toLowerCase()) {
            case "gasolina":
                tipoCombustivel = "Gasolina";
                System.out.println("Combustível alterado com sucesso!");
                System.out.println("Combustível na bomba: " + tipoCombustivel);
                alterarValor();
                break;
            case "aditivada":
                tipoCombustivel = "Aditivada";
                System.out.println("Combustível alterado com sucesso!");
                System.out.println("Combustível na bomba: Gasolina " + tipoCombustivel);
                alterarValor();
                break;
            case "etanol":
            case "alcool":
                tipoCombustivel = "Etanol";
                System.out.println("Combustível alterado com sucesso!");
                System.out.println("Combustível na bomba: " + tipoCombustivel);
                alterarValor();
                break;
            case "diesel":
                tipoCombustivel = "Diesel";
                System.out.println("Combustível alterado com sucesso!");
                System.out.println("Combustível na bomba: " + tipoCombustivel);
                alterarValor();
                break;
            default:
                System.out.println("Tipo de combustível não reconhecido.");
        }
    }

    public void alterarQuantidadeCombustivel(){
        System.out.println("\n==============================\n");
        System.out.println("Digite a quantidade de combustivel restante na bomba: ");
        quantidadeCombustivel = scanner.nextFloat();
        if (quantidadeCombustivel <= 0){
            alterarQuantidadeCombustivel();
        }
        System.out.println("Quantidade alterada com sucesso!");
        System.out.println("Quantidade de combustível: " + df.format(quantidadeCombustivel) + " L");
    }
}

