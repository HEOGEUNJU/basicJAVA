package Exercise31_33;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		int num1 = scanner.nextInt();

		System.out.print("총 인구는?(단위: 만)");
		int num2 = scanner.nextInt();

		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int num3 = scanner.nextInt();

		// 3항연산자를 이용한 방법
//		String result = (num1==1 && num2>=100 || num3>=50) ? "메트로폴리스입니다" : "메트로폴리스가 아닙니다." ;
//		String result = ((num1==1 && num2>=100) || num3>=50) ? "메트로폴리스입니다" : "메트로폴리스가 아닙니다." ;    
//		String result = (num1==1) ? ((num2>=100 && num3>=50) ? "메트로폴리스입니다." : "메트로폴리스가 아닙니다.") : "메트로폴리스가 아닙니다.";

		/*
		 * if를 이용한 방법 if(num1 == 1 && num2>=100) { System.out.println("메트로 폴리스입니다.");
		 * }else if (num3>=50) { System.out.println("메트로 폴리스입니다."); }else {
		 * System.out.println("메트로 폴리스가 아닙니다."); }
		 */
		// if를 이용한 방법2
		String result = "";
		if (num1 == 1 && num2 >= 100 || num3 >= 50) {
			result = "메트로폴리스입니다.";
		} else {
			result = "메트로폴리스가 아닙니다";
		}
		System.out.println("이도시는 " + result);

	}

}
