package exerciseJava.java;

public class exercise9 {

	public static void main(String[] args) {
		System.out.println("**2단부터 7단 곱하기 3까지**");
		for (int i = 2; i <= 7; i++) { // 처음 for문을 통해 단수를 정한다.
			for (int j = 1; j <= 3; j++) { // for문 속에 for문을 대입해서 단수에 곱하기를 입힌다.
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}