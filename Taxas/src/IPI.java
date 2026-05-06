public class IPI {

    static double aliquotaIPI = 0.219;

    public double taxarIPI (double valor, String tipo){
        if (tipo.equals("produto")){
            System.out.println("Valor IPI: " + (valor * aliquotaIPI));
            return valor * aliquotaIPI;
        } else {
            return 0;
        }
    }
}
