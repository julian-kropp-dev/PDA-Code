package GamblingMachine;

public class GamblingMachine {
    private int balance;

    public GamblingMachine() {
        balance = 0;
    }

    public void insertCoins(int value) {
        balance += value;
    }

    public int getBalance() {
        return balance;
    }

    public int withdraw() {
        int result = balance;
        balance = 0;
        return result;
    }

    public boolean play() {
        int numberOne = (int) (Math.random() * 100);
        int numberTwo= (int) (Math.random() * 100);

        return numberOne == numberTwo;
    }
}
