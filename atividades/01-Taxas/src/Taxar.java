public class Taxar {

    public String tipo;
    public double valor;

    public Taxar(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public void calculartaxas(){
        IPI ipi = new IPI();
        ISS iss = new ISS();
        ICMS icms = new ICMS();

        System.out.println("Valor do " + tipo + ": " + valor);

        double valorIPI = ipi.taxarIPI(this.valor, this.tipo);
        double valorISS = iss.taxarISS(this.valor, this.tipo);
        double valorICMS = icms.taxarICMS(this.valor, this.tipo);

        double valorTotal = valor + valorIPI + valorISS + valorICMS;

        System.out.println("Valor total: "  + valorTotal + "\n");
    }
}
