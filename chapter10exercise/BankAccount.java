package chapter10exercise;

public abstract class BankAccount {
	//필드
	protected int balance;
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	 //메소드
	public abstract String getAccountType();
	
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public boolean withdraw(int amount) {
		if(balance>=amount) {
			this.balance -= amount;
			return true;
		}
		return false;  
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
	if(amount<0||amount>balance) {
		throw new IllegalArgumentException();
	}
	this.balance -= amount;
	
	otherAccount.deposit(amount);
	return true;
	}
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
