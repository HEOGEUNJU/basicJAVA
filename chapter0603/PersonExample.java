package chapter0603;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234657", "홍길동");
		Person p2 = new Person("654321-7654321", "허근주");
		Person p3 = new Person("654321-7654321", "메소드","usa");
		 System.out.println(p1.nation);
		 System.out.println(p1.ssn);
		 System.out.println(p1.name);		 
		 System.out.println(p2.ssn);
		 System.out.println(p2.name);
		 System.out.println(p3.ssn);
		 System.out.println(p3.name);
		 System.out.println(p3.nation);
		 
		 
		 //p1.nation = "usa";
		 //p1.ssn = "654321-7654321";
		 p1.name = "홍삼원";
	}

}
