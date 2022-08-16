package chapter04;

import java.util.Scanner;

public class confirm07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0; //잔액

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt();
//			System.out.println(select);
			if (select == 1) {
				System.out.print("예금액> ");
				int money = scanner.nextInt();
				

			} else if (select == 2) {
				System.out.print("출금액> ");
				int money2 = scanner.nextInt();
			

			} else if (select == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);

			} else {

				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
}
