public class Motocicleta extends Veiculos {

    @Override
    public void setTipo(){
        tipo = "Motocicleta";
        super.setPeso();
        setTipoComplemento();
    }

    @Override
    public void setTipoComplemento(){
        if (peso <= 100) {
            tipoComplemento = "leve";
            preco = 2;
            setPreco();
        } else if (peso < 300) {
            tipoComplemento = "padrão";
            preco = 4;
            setPreco();
        } else if (peso <= 400) {
            tipoComplemento = "pesada";
            preco = 10;
            setPreco();
        } else {
            System.out.println("==================================================");
            System.out.println("Peso máximo excedido!");
            System.out.println(tipo + " não aceita no estacionamento");
        }
    }

}
