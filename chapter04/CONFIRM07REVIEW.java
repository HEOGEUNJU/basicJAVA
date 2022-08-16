package chapter04;

import java.util.Scanner;

public class CONFIRM07REVIEW {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // 잔액

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {

			case 1:
				System.out.println("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.println("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴를 입력했습니다. 다시 입력해주세요.");
				break;
			}
		}
		System.out.println("프로그램 종료");

	}
}