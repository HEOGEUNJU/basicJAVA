package exercise41_45;

import java.util.Scanner;

public class Exercise44_시험출제문제 {

	public static void main(String[] args) {
		// 시험에 나올 문제
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String CS = scanner.nextLine();
		System.out.print("영희: ");
		String YH = scanner.nextLine(); 
// 		처음 사용한 방법
//		if (CS.equals(YH)) {
//			System.out.println("결과 : 무승부");
//		} else if (CS.equals("가위") && YH.equals("보")) {
//			System.out.println("결과 : 철수승");
//		} else if (CS.equals("가위") && YH.equals("바위")) {
//			System.out.println("결과 : 영희승");
//		} else if (CS.equals("바위") && YH.equals("보")) {
//			System.out.println("결과 : 영희승");
//		} else if (CS.equals("바위") && YH.equals("가위")) {
//			System.out.println("결과 : 철수승");
//		} else if (CS.equals("보") && YH.equals("가위")) {
//			System.out.println("결과 : 영희승");
//		} else if (CS.equals("보") && YH.equals("바위")) {
//			System.out.println("결과 : 철수승");

//		배운방법(이걸로 외우기)
		String result = "";
		if (CS.equals(YH)) {
			result = "비김";
		} else if (CS.equals("가위") && YH.equals("바위") 
				|| CS.equals("바위") && YH.equals("보")
				|| CS.equals("보") && YH.equals("가위")) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과: " + result);

	}

}
