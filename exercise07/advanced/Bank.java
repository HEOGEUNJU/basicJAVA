package exercise07.advanced;

public class Bank {
	//필드
	/**
	 * 은행의 고객 목록
	 */
	private Customer[] customers;
	/**
	 * 은행의 고객 수
	 */
	private int numberOfCustomers;
	//필드의 값을 초기화 할 때 생성자를 많이 사용
	//생성자
	public Bank() {
		this.customers = new Customer[10];				
	}
	//메소드
	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers++] = customer;
//		numberOfCustomers++;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	/** 
	 * 배열의 index번째 고객(Customer) 객체를 반환
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
