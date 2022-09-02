package exerciseJava.java;

import java.util.Random;

public class exercise6 {

	public static void main(String[] args) {
		Random random = new Random();

//		while (true) {
//			int num1 = random.nextInt(6) + 1;
//			int num2 = random.nextInt(6) + 1;
//			System.out.println("(" + num1 + "," + num2 + ")");
//			if ((num1 + num2) == 6) {
//				
//			}
//		}
		int i = random.nextInt(6) + 1;
		int j = random.nextInt(6) + 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (i + j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}
}
