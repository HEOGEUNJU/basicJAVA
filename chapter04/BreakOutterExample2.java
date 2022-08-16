package chapter04;

import java.util.Scanner;

public class BreakOutterExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("생략할 곱하기:");
		int dan = scanner.nextInt();

		for (int i = 2; i <= 9; i++) {
			if (dan == i) {
				continue;
			}
			System.out.println("***" + i + "단***");
			for (int j = 1; j <= 9; i++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}