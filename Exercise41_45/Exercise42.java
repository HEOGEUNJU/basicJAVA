package Exercise41_45;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("월을 입력하세요(1~12)");
		int month = scanner.nextInt();

//		if (month >= 3 && month <= 5) {
//			System.out.println(month + "월은 봄입니다.");
//		} else if (month <= 8 && month >= 6) {
//			System.out.println(month + "월은 여름입니다.");
//		} else if (month <= 11 && month >= 9) {
//			System.out.println(month + "월은 가을입니다.");
//		} else if (month == 1 || month == 2 || month == 12) {
//			System.out.println(month + "월은 겨울입니다.");
//		} else
//			System.out.println(month + "월은 잘못된 입력입니다.");
	
		// 결과값 초기화 하고 작성하는 방법
		String season = "";
		if (month >= 3 && month <= 5) {
			season = "봄";
		}else if (month <= 8 && month >= 6) {
			season = "여름";
		}else if (month <= 11 && month >= 9) {
			season = "가을";
		}else if (month == 1 || month == 2 || month == 12) {
					season = "겨울";
		}else {
			season = "알 수 없는 계절";
		}System.out.println(month + "월은" + season + "입니다.");
	}
}
