package chapter04;

import java.util.Random;

public class BreakExample {

	public static void main(String[] args) {
		Random random = new Random();
		while (true) {
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
