package chapter04;

public class ForMultiflicationTableExample {

	public static void main(String[] args) {
		for (int m = 2; m <= 20; m++) {
			System.out.println("***" + m + "단***");
			for (int n = 1; n <= 20; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
	}

}
