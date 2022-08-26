package exercise07;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
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
		return firstName+lastName + ", 잔고: "+account.getBalance()+"원";
	}
	
}
