package chapter11;

public class StringValueOfExample {

	public static void main(String[] args) {
		//숫자나 boolean타입의 데이터를 문자로 바꾸는 메소드 
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}