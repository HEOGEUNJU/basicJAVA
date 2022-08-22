package chapter0603;

public class Person {
	String nation = "Korea"; // final을 쓰면 새로운 값을 넣을 수는 없어진다.
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name + this.nation;
	}
	public Person(String ssn, String name, String nation) {
		this.ssn = ssn;		
		this.name = name + this.nation;
		this.nation = nation;
	}
}