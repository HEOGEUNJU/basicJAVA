package Exercise_java;

public class exercise2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}