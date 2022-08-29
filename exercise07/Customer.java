package exercise07;

public class Customer {
	//필드
	/**
	 * 고객 이름
	 */
	private String firstName;
	/** 
	 * 고객성
	 */
	private String lastName;
	/**
	 * 고객이 소유한 계좌
	 */
	private BankAccount account;
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
//		return firstName+lastName + ", 잔고: "+account.getBalance()+"원";
		return String.format("이름 : %s %s, 잔고: %,d원",firstName,lastName,account.getBalance());
		// 금액에 ,를 찍고 싶으면 %,d를 하면 세자리마다 ,로 끊어준다.
	}
	
}
