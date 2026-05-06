import java.util.Scanner;

public class Gerenciar {

    Scanner scanner = new Scanner(System.in);

    public void userInterface(){

        System.out.println("==================================================");
        System.out.println("Bem vindo ao sistema de garagem :)");
        System.out.println("1 - Informar um novo veículo");
        System.out.println("9 - Sair");
        System.out.print("Digite a opção desejada: ");
        int escolha = scanner.nextInt();
        while (escolha == 1){
            setTipo();
            escolha = 9;
            userInterface();
        }
        if (escolha == 9) {
            return;
        } else {
            System.out.println("Opção não reconhecida!");
            userInterface();
        }
    }

    public void setTipo(){
        System.out.println("==================================================");
        System.out.println("No estacionamento é permitido os seguintes modelos de veículo: ");
        System.out.println("1 - Motocicletas");
        System.out.println("2 - Carros de passeio");
        System.out.println("3 - Caminhonetes");
        System.out.println("4 - Furgões");
        System.out.print("Digite o número que representa o modelo do seu veículo: ");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:
                Motocicleta motocicleta = new Motocicleta();
                motocicleta.setTipo();
                break;
            case 2:
                Carro carro = new Carro();
                carro.setTipo();
                break;
            case 3:
                Caminhonete caminhonete = new Caminhonete();
                caminhonete.setTipo();
                break;
            case 4:
                Furgao furgao = new Furgao();
                furgao.setTipo();
                break;
            default:
                System.out.println("==================================================");
                System.out.println("Modelo não reconhecido!");
                setTipo();
        }
    }
}
