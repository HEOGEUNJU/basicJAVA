package chapter05;

import java.util.Iterator;

public class AdvancedForExample {
	//향상된 for문 사용하기
	
	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87 };                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		int sum = 0; 
		for (int score : scores) { // scores의 첫번째 수부터 앞으로 들어간다.
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);

		double avg = (double) sum / scores.length;
	System.out.println("점수 평균 = " + avg);
	
	}
}
