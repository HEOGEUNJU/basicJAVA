package chapter03;

import java.util.Scanner;

public class 무한대 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double first = scanner.nextDouble();
		
		System.out.println("두 번째 수 : ");
		System.out.println("두 번째 수 : ");
		double second = scanner.nextDouble();
		
		String result = (second != 0) ? ("결과 : " + first/second) : ("결과 : 무한대");
//		String result = (second == 0 || second == 0.0) ? "무한대" : first / second + "";
		System.out.println(result);
		
	}

}
