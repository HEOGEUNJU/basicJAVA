package chapter06;

public class Member {
	// 필드
	String name;
	String id;
	String password;
	int age;

	Member() {
		password = "1234"; // 에러 안나는 법 => 밑에 줄을 먼저 선언하면 에러 안남
		this(null,null); //Heap 영역에 Member라는 클래스를 생성하고 그 생성된 주소값을 반환
	}
	Member(String name) { // String n = "이순신"
		this.name = name;
	}

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
