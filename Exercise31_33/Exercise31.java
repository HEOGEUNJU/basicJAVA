package Exercise31_33;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요.");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 숫자를 입력하세요.");
		int num2 = scanner.nextInt();

		int bigNum = ((num1 + num2) + Math.abs(num1 - num2)) / 2;
		int smallNum = ((num1 + num2) - Math.abs(num1 - num2)) / 2;

		System.out.print("큰 수를 작은 수로 나눈 몫은" + bigNum / smallNum + "이고, 나머지는" + bigNum % smallNum + "이다");

	}

}