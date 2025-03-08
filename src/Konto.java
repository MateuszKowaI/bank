public class Konto {
    private final int numerKonta;
    protected double saldo;

    public Konto(int numerKonta) {
        this(numerKonta, 0.0);
    }

    public Konto(int numerKonta, double saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public void wplata(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
        }
    }

    public void wyplata(double kwota) {
        if (kwota > 0 && kwota <= saldo) {
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
