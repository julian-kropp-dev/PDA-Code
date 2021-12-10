package uebung7;
public class Account {
    private final String besitzer;
    private double kontostand;

    public Account(String besitzer, double kontostand) {
       this.besitzer = besitzer;
       this.kontostand = kontostand;
    }

    public String getKontostand() {
        return besitzer + " hat einen Kontostand von " + kontostand + " Bitcoin";
    }

    public double  einzahlen(double betrag) {
        return kontostand += betrag;
    }
    public double auszahlen(double betrag) {
        if (kontostand - betrag > 0) return kontostand -= betrag;
        return kontostand;
    }


}
