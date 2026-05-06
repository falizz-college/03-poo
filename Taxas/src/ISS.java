public class ISS {

    static double aliquotaISS = 0.073;

    public double taxarISS(double valor, String tipo){
        if (tipo.equals("serviço")){
            System.out.println("Valor ISS: " + (valor * aliquotaISS));
            return valor * aliquotaISS;
        } else {
            return 0;
        }
    }
}
