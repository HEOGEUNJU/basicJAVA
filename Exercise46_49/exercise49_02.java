package Exercise46_49;

import java.util.Random;

public class exercise49_02 {

	public static void main(String[] args) {


		int[] dice = new int[6];

		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			dice[random.nextInt(6)]++;

		}
		System.out.println("-------------");
		System.out.println("면\t빈도");
		System.out.println("-------------");
		for (int i = 0; i < dice.length; i++)
			System.out.println((i + 1) + "\t" + dice[i]);

	}
}
