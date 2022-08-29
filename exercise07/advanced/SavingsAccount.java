package exercise07.advanced;

public class SavingsAccount extends BankAccount{
	//필드
	public double interestRate;
	//생성자
	public SavingsAccount(int balance, double interestRate) {
		// TODO Auto-generated constructor stub
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
	
	
}
