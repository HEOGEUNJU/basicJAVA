package exercise07.advanced;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	public CheckingAccount(int balance) {
		super(balance);
	}

	@Override
	public boolean withdraw(int amount) {
		// 만약 SavingAccount에 10000원이 있고,
		// ChechingAccount에 5000원이 있을 경우
		// 백지수표로 7500원짜리 물건을 구매했을 경우
		// 7500에서 ChechingAccount를 빼고 나머지 금액을 SavingAccount에서 뺀다.
		if (amount > balance) {
			protectedBy.balance -= amount - balance;
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}
}