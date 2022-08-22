package exercise46_49;

import java.util.Arrays;
import java.util.Random;

public class exercise47 {
	public static void main(String[] args) {
		Random random = new Random();

		int num[] = { random.nextInt(45) + 1, random.nextInt(45) + 1, random.nextInt(45) + 1, random.nextInt(45) + 1,
				random.nextInt(45) + 1, random.nextInt(45) + 1, random.nextInt(45) + 1 };
		Arrays.sort(num);
		int k = random.nextInt(45) + 1;

		for (int i = 0; i < 6; i++) {
			int j = num[i];
			if (num[i] != num[i + 1]) {
				System.out.println(j);
			} else if (k != num[i]) {
				System.out.println(k);
			}
		}
	}
}