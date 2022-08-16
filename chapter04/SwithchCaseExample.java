package chapter04;

import java.util.Random;

public class SwithchCaseExample {
	public static void main(String[] args) {

		// sw + crtl + space 첫번째꺼 누르면 공식 나온다.
		Random random = new Random();
		int num = random.nextInt(6) + 1;

		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		default:
			break;
		// 반드시 break를 써야한다. 쓰지 않으면 값이 나온 지점부터 마지막 케이스가 나올때까지 수식이 break가 나올 때까지 실행된다.
		}
	}

}
