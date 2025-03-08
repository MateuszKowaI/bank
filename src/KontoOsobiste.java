public class KontoOsobiste extends Konto{
    public KontoOsobiste(int numer) {
        super(numer);
    }

    public KontoOsobiste(int numer, double kwota) {
        super(numer, kwota);
    }

    @Override
    public void wyplata(double kwota) {
        System.out.println("Wypłata z konta osobistego: " + kwota);
        super.wyplata(kwota);
    }
}
