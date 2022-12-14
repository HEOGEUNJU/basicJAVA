package exercise07;

public class BankAccount {
	//필드
	protected int balance;
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	//메소드
	public int getBalance() {
		return this.balance;
	}
	/**
	 * 입금 메소드
	 * @param amount 입금할 금액
	 */
	public void deposit(int amount) {
		this.balance += amount;
	}
	/**
	 * 출금 메소드
	 * @param amount 출금할 금액
	 * @return 출금 성공시 true, 실패시 false 반환
	 */
	public boolean withdraw(int amount) {
		if(balance>=amount) {
			this.balance -= amount;
			return true;
		}
		return false;  
	}
	/**
	 * 이체 메소드
	 * @param amount 이체할 금액
	 * @param otherAccount 이체될 계좌번호 
	 * @return 이체 성공시 true, 실패시 false 반환
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
//		if(balance-amount <= 0) {
//			return false;
//		}
//		this.balance -= amount;
//		otherAccount.deposit(amount);
//		return true;
		if(withdraw(amount)){
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "잔액: " + balance + "원";
	}
}
