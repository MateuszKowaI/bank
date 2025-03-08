import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Konto> konta = new ArrayList<>();

    public static void dodajKonto(Konto konto) {
        konta.add(konto);
    }

    public static void wyswietlKonta() {
        for (int k = 0; k < konta.size(); k++) {
            if (konta.get(k) instanceof KontoOsobiste){
                System.out.println(k + ". Konto osobiste: " + konta.get(k).getNumerKonta() + " | Saldo: " + konta.get(k).getSaldo());
            }
            else if (konta.get(k) instanceof KontoFirmowe){
                System.out.println(k + ". Konto Firmowe: " + konta.get(k).getNumerKonta() + " | Saldo: " + konta.get(k).getSaldo() + " | Limit kredytowy: " + ((KontoFirmowe) konta.get(k)).getLimitKredytowy());
            }else{
                System.out.println(k + ". Konto: " + konta.get(k).getNumerKonta() + " | Saldo: " + konta.get(k).getSaldo());
            }
        }
    }
}
