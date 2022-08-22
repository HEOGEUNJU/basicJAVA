package exercise46_49;

import java.util.Random;

public class exercise47_04 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		Random random = new Random();
		int[] balls = new int[45];
		//두번째 방법		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
			
		}
		for (int i = 0; i < balls.length; i++) {
			int temp = balls[i];
			int ranNum = random.nextInt(45);
			balls[i] = balls[ranNum];
			balls[ranNum] = temp;
			
		}
		// 섞인 공에서 앞의 6개 잘라서 lotto에 넣기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
			
		}
		//출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(balls[i]);
		}
	}
}
