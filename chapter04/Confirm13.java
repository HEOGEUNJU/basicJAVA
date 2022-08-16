package chapter04;

import java.util.Scanner;

public class Confirm13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력");
		int score = scanner.nextInt();
		// 스위치 ()안에 값을 case + 값과 일치시키는 수식을 만들면 된다.

		switch (score / 10 * 10) {
		case 100:
		case 90:
			System.out.print("A");
			break;
		case 80:
			System.out.print("B");
			break;
		case 70:
			System.out.print("C");
			break;
		default:
			System.out.print("D");
		}
	}
}