package chapter02_confirm;
import java.util.Scanner;

public class 홍길동 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String regNo = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String phoneNumber = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름:" + name);
		System.out.println("2. 주민번호 앞 6자리:" + regNo);
		System.out.println("3. 전화번호:" + phoneNumber);
		
		
		
	}

}
