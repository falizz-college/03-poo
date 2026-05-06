public class ICMS {

    static double aliquotaICMS = 0.132;

    public double taxarICMS (double valor, String tipo){
        if (tipo.equals("produto") || tipo.equals("serviço")){
            System.out.println("Valor ICMS: " + (valor * aliquotaICMS));
            return valor * aliquotaICMS;
        } else {
            return 0;
        }
    }

}
