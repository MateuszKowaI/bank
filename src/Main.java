public class Main {
    public static void main(String[] args) {
        Bank.dodajKonto(new KontoOsobiste(1234, 200));
        Bank.wyswietlKonta();
        Bank.konta.get(0).wplata(100);
        Bank.wyswietlKonta();
    }
}