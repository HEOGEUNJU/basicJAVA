package chapter02;

import java.util.Scanner;

public class inputExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + c or ctrl + /==> 한줄 주석 
		// ctrl + shift + / ==> 여러 줄 주석
//		int inputNum = scanner.nextInt();
//		
//		double inputDouble = scanner.nextDouble();
//		
//		System.out.println("첫번째 숫자: "+ inputNum);
//		System.out.println("두번째 숫자: "+ inputDouble);
		
//		System.out.print("이름을 입력하세요: ");
//		String inputName = scanner.next();
//		System.out.println("당신의 이름은 " + inputName + "입니다.");
//
//		
		int inputNum = scanner.nextInt();
		double inputDouble = scanner.nextDouble();
		System.out.print("쓰고 싶은 내용을 쓰시오");
		String rkrkrkrk = scanner.next();
		System.out.println("쓴 내용은 " + rkrkrkrk + " 입니다.");

	
	}

}
