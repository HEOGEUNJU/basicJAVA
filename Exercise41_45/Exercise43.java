package Exercise41_45;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int score1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int score2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int score3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int score4 = scanner.nextInt();
		System.out.print("머신러닝: ");
		int score5 = scanner.nextInt();
		int total = (score1 + score2 + score3 + score4 + score5);
		double average = total / 5.0;
		char grade = 0;
		if (average >= 90) {
			grade = 'A';

		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else {
			grade = 'F';

		}
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + average);
		System.out.println("평균 :" + grade);

	}
}