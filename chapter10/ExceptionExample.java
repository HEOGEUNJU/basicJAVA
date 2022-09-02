package chapter10;

import java.util.Scanner;

import exercise07.Student;

public class ExceptionExample {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// 1.일반 예외
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("입력하신 클래스가 존재하지 않습니다.");
		}
		
		try (Scanner scanner = new Scanner(System.in)) {
			int nextInt = scanner.nextInt();
			System.out.println(nextInt);
		}
		
		
		// 2. 실행 예외
		try {
			Student student = null;
			student.compareTo(new Student("홍길동", 10, null));
			int[] numbers = {1,2,3};
			System.out.println(numbers[5]);
		}catch (NullPointerException e) {
			System.out.println("null 참조 에러 발생");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" 인덱스 에러");
		}catch (Exception e) {
			e.printStackTrace();
//			System.out.println("알 수 없는 예외가 발생해씁니당.");
		}finally {
			System.out.println("반드시 출력해야 할 문장");			
		}
	}
}
