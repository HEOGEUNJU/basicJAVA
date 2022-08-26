package exercise07;

public class BankAccount {
	//필드
	private int balance;
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	//메소드
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public boolean withdraw(int amount) {
		if(balance-amount<=0) {
			return false;  
		}
		this.balance -= amount;
		return true;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(balance-amount <= 0) {
			return false;
		}
		this.balance -= amount;
		otherAccount.deposit(amount);
		return true;
		
	}
}
