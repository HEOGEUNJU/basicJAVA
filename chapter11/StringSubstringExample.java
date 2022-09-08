package chapter11;

public class StringSubstringExample {

	public static void main(String[] args) {
		//문자 자르기
		//자바의 substring()과 오라클의 substr()은 다르다.
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);// 0부터 6 앞까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 7부터 끝까지
		System.out.println(secondNum);
	}	

}
