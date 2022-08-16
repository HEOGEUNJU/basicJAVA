package Exercise41_45;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요. : ");
		int A = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요. : ");
		int B = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요. : ");
		int C = scanner.nextInt();
		String result="";
// int인 경우에는 int result = 0;으로 초기화
//		if (A > B && A > C && A < B + C) {						처음 사용한 방법
//			System.out.println("삼각형을 만들 수 있습니다.");
//		} else if (B > A && B > C && B < A + C) {
//			System.out.println("삼각형을 만들 수 있습니다.");
//		} else if (C > A && C > B && C < B + A) {
//			System.out.println("삼각형을 만들 수 있습니다.");
//		} else
//			System.out.println("삼각형을 만들 수 없습니다.");
//		  if (A > B + C) {										두번째로 사용한 방법
//			System.out.println("삼각형을 만들 수 없습니다.");
//		} else if (B > A + C) {
//			System.out.println("삼각형을 만들 수 없습니다.");
//		} else if (C > B + A) {
//			System.out.println("삼각형을 만들 수 없습니다.");
//		} else
//			System.out.println("삼각형을 만들 수 있습니다.");

//	하나로 통합한 방법 
//  위에 방법에는 result 선언을 할 수 없다 : 연속 부정으로 result 값에는 아무것도 안들어가기 때문에 사용할 수 없다.
//	아래의 경우에는 초기화를 하고 결과값을 나중에 프린팅되도록 하는게 제일 좋다.
		if (A > B + C || B > A + C || C > B + A) {
			result = "삼각형을 만들 수 없습니다.";

		} else {
			result = "삼각형을 만들 수 있습니다.";
		}
		System.out.println(result);
	}
}