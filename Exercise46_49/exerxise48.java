package exercise46_49;

import java.util.Random;
import java.util.Scanner;

public class exerxise48 {
	public static void main(String[] args) {
		Random random = new Random();
		int computer = random.nextInt(2) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요.");
		String gamer = scanner.nextLine();
		// 컴퓨터 값을 문자로 변경
		String[] comArr = {"가위", "바위", "보"};
		String comResult = comArr[computer];
//		String comResult = "";
//		if (computer == 1) {
//			comResult = "바위";
//		} else if (computer == 2) {
//			comResult = "가위";
//		} else {
//			comResult = "보";
//		}
		
		//가위바위보 경우의 수
		String result = "";
		if (gamer.equals(comResult)) {
			result = "비김";
		} else if (gamer.equals("바위") && comResult.equals("가위") 
				|| gamer.equals("가위") && comResult.equals("보")
				|| gamer.equals("보") && comResult.equals("바위")) {
			result = "게이머 승리";
		} else {
			result = "컴퓨터 승리";
		}
		
		System.out.println("게이머 : " + gamer);
		System.out.println("인공지능 컴퓨터 : " + comResult);
		System.out.println("결과 : " + result);
	}
}