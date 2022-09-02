package chapter10exercise;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int firstNum = scanner.nextInt();
				if (firstNum > 0) {
					System.out.print("어떤 수를 나누시겠습니까?>>");
				} else {
					System.out.println("잘못된 입력입니다. 다시입력해주세요.");
					System.out.print("어떤 수로 나누시겠습니까?>>");
				}
				int secondNum = scanner.nextInt();
				if (secondNum == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");

				} else if (firstNum % secondNum == 0 && secondNum > 0) {
					System.out.println(firstNum + "/" + secondNum + "=" + firstNum / secondNum);
					break;
				} else {
					System.out.println(secondNum + "으로 나눌 수 없습니다. 다시 입력해주세요");

				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				scanner.nextLine();
			}
		}

	}

}
