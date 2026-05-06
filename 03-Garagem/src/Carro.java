public class Carro extends Veiculos{

    @Override
    public void setTipo(){
        tipo = "Carro de passeio";
        super.setPeso();
        setTipoComplemento();
    }

    @Override
    public void setTipoComplemento(){
        if (peso <= 2000) {
            System.out.println("==================================================");
            System.out.println("No estacionamento é permitido os seguintes modelos de veículo: ");
            System.out.println("1 - Hatchback");
            System.out.println("2 - Sedan");
            System.out.println("3 - SUV");
            System.out.print("Digite o número que representa o modelo do seu veículo: ");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    tipoComplemento = "Hatchback";
                    preco = 13;
                    setPreco();
                    break;
                case 2:
                    tipoComplemento = "Sedan";
                    preco = 15;
                    setPreco();
                    break;
                case 3:
                    tipo = "SUV";
                    tipoComplemento = "";
                    preco = 20;
                    setPreco();
                    break;
                default:
                    System.out.println("==================================================");
                    System.out.println("Modelo não reconhecido!");
                    setTipo();
            }
        } else {
            System.out.println("Peso máximo de Carro excecdido!");
            System.out.println("Carro classificado como Furgão");
            Furgao furgao = new Furgao();
            furgao.setTipo();
            furgao.setTipoComplemento();
        }
    }

}
