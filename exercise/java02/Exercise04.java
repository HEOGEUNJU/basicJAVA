package exercise.java02;

public class Exercise04 {
	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < money / coinUnit.length; i++) {
			int j = money / coinUnit[i];
			money -= coinUnit[i] * j;
			System.out.println(coinUnit[i] + "원:" + j);
		}
	}
}
