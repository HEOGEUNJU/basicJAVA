package exercise46_49;

import java.util.Random;

public class exercise49 {

	public static void main(String[] args) {
		Random random = new Random();
		int count[] = { 0, 0, 0, 0, 0, 0 };

		System.out.println("-------------");
		System.out.println("면\t빈도");
		System.out.println("-------------");

		for (int i = 1; i <= 10000; i++) {
			int dice = random.nextInt(6) + 1;
			switch (dice) {

			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			case 4:
				count[3]++;
				break;
			case 5:
				count[4]++;
				break;
			case 6:
				count[5]++;
				break;

			}
		}
		System.out.println("1\t" + count[0]);
		System.out.println("2\t" + count[1]);
		System.out.println("3\t" + count[2]);
		System.out.println("4\t" + count[3]);
		System.out.println("5\t" + count[4]);
		System.out.println("6\t" + count[5]);
	}

}
