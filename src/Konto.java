public class Konto {
    private final int numerKonta;
    protected double saldo;

    public Konto(int numer) {
        this.numerKonta = numer;
        this.saldo = 0;
    }

    public Konto(int numer, double kwota) {
        this.numerKonta = numer;
        this.saldo = kwota;
    }

    public void wplata(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
        }
    }

    public void wyplata(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
        } else {
            System.out.println("Brak środków na koncie!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumerKonta() {
        return numerKonta;
    }
}
