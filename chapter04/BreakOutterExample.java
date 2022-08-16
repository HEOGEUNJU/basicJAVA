package chapter04;

import java.util.Scanner;

public class BreakOutterExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("멈출 단을 입력: ");
		int dan = scanner.nextInt();

		for (int i = 2; i <= 9; i++) {
			if (dan == i - 1) {
				break;
			}
			System.out.println("***" + i + "단***");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}