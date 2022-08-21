package atvd5.entites;

public class entities {

	private String nameHolder;
	private int numberAccount;
	private double balance;

	public entities() {

	}

	public entities(String nameHolder, int numberAccount, int balance) {
		this.nameHolder = nameHolder;
		this.numberAccount = numberAccount;
		this.balance = balance;
	}

	public entities(String nameHolder, int numberAccount) {
		this.nameHolder = nameHolder;
		this.numberAccount = numberAccount;
	}

	public String getNameHolder() {
		return nameHolder;
	}

	public void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void addNumberAccount(int numberAccountAdd) {
		this.numberAccount = numberAccountAdd;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double valueDeposit) {
		this.balance += valueDeposit;
	}
	public void removeBalance(double valueSaque) {
		this.balance -= (valueSaque + 5);
	}

	public String toString() {
		return "Account date:\n" + "Account " + numberAccount + ", Holder: " + nameHolder + String.format(" $ %.2f", balance);
	}

}
