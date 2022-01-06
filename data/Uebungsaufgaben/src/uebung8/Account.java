package uebung8;
public class Account {

	private String owner;
	private int balance;

	public Account(String owner) {
		setOwner(owner);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount >= 0){
			balance = getBalance() + amount;
		}

	}

	public boolean withdraw(int amount) {
		if (amount >= 0){
			if (getBalance() >= amount) {
				balance = getBalance() - amount;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean transfer(int amount, Account other) {
		if (amount >= 0){
			if (getBalance() >= amount) {
				balance -= amount;
				other.balance += amount;
				return true;
			} else {
				return false;
			}
		}
		return false;

	}
	
}