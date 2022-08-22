package exercise41_45;

import java.util.Random;
//import java.util.Random;
import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
//		Random random = new Random();
		int num = new Random().nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int num2 = scanner.nextInt();
			if (num > num2) {
				System.out.println("정답은 더 큰 수 입니다.");

			} else if (num < num2) {
				System.out.println("정답은 더 작은 수 입니다.");

			} else {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
