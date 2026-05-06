public class Caminhonete extends Veiculos {

    @Override
    public void setTipo(){
        tipo = "Caminhonete";
        super.setPeso();
        setTipoComplemento();
    }

    @Override
    public void setTipoComplemento(){
        if(peso <= 3000){
            tipoComplemento = "não carregada";
            preco = 25;
            setPreco();
        } else if (preco <= 6000){
            tipoComplemento = "carregada";
            preco = 50;
            setPreco();
        }
    }

}
