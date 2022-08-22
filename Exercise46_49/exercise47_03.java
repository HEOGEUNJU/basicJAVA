package exercise46_49;

import java.util.Arrays;
import java.util.Random;

public class exercise47_03 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random random = new Random();
		// 첫번째 방법
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
			System.out.println(lotto[i] + " ");
		}
		// 출력
	}
}