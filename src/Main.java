public class Main {
    public static void main(String[] args) {
        Konto konto1 = new KontoOsobiste(1234, 200);
        Bank.dodajKonto(konto1);
        Bank.wyswietlKonta();
        konto1.wplata(100);
        Bank.wyswietlKonta();
    }
}