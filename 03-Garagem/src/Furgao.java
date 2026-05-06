public class Furgao extends Veiculos{

    double volume;

    @Override
    public void setTipo(){
        tipo = "Furgão";
        super.setPeso();
        setTipoComplemento();
    }

    @Override
    public void setTipoComplemento(){
        if(peso <= 3000){
            tipoComplemento = "não carregaodo";
            preco = 25;
            setVolume();
            setPreco();
        } else if (preco <= 6000){
            tipoComplemento = "carregado";
            preco = 50;
            setVolume();
            setPreco();
        }
    }

    public void setVolume(){
        System.out.println("Digite as dimensões do " + tipo);
        System.out.print("Comprimento: ");
        int comprimento = scanner.nextInt();
        System.out.print("Largura: ");
        int largura = scanner.nextInt();
        System.out.println("Altura: ");
        int altura = scanner.nextInt();
        volume = comprimento * largura * altura;
        if (volume > 18){
            System.out.println("Volume máximo excedido!");
            System.out.println(tipo + " não aceito(a) no estacionamento");
        }
    }
}
