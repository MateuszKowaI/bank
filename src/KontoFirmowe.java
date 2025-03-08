public class KontoFirmowe extends Konto{
    private double limitKredytowy;

    public KontoFirmowe(int numerKonta, double saldo, double limitKredytowy) {
        super(numerKonta, saldo);
        this.limitKredytowy = limitKredytowy;
    }

    @Override
    public void wyplata(double kwota) {
        if (kwota <= saldo + limitKredytowy) {
            saldo -= kwota;
            System.out.println("Wypłacono z konta firmowego: " + kwota);
        } else {
            System.out.println("Przekroczono limit kredytowy!");
        }
    }
    public double getLimitKredytowy(){
        return limitKredytowy;
    }
}
