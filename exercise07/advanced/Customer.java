package exercise07.advanced;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts; 
	private int numberOfAccounts; 
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}


	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] =account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	@Override
	public String toString() {
		return String.format("이름 : %s %s, 잔고: %,d원",firstName,lastName,getNumberOfAccounts());
	}
	
}
