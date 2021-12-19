package uebung7;


public class TestClassAccount {
    public static void main(String[] args) {
        Account eins = new Account("Donald Duck", 0.0);
        Account zwei = new Account("Dagobert Duck", 0.0);

        System.out.println(eins.einzahlen(20.0));
        System.out.println(zwei.einzahlen(19.34));
        System.out.println(eins.auszahlen(4.2));
        System.out.println(zwei.auszahlen(34567.0));
        System.out.println(eins.einzahlen(234456789));
        System.out.println(zwei.einzahlen(45678));
        System.out.println(eins.auszahlen(0.0));
        System.out.println(zwei.auszahlen(0.0));
        System.out.println(eins.getKontostand());
        System.out.println(zwei.getKontostand());

    }
}
