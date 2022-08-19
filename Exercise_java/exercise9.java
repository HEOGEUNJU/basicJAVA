package Exercise_java;

public class exercise9 {

	public static void main(String[] args) {
		System.out.println("**2단부터 7단 곱하기 3까지**");
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}