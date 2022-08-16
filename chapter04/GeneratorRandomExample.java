package chapter04;

import java.util.Random;

public class GeneratorRandomExample {
	public static void main(String[] args) {
		
		/*
		 * 랜덤(Random) => 난수 
		 * 컴퓨터 랜덤 : 가짜 랜덤(pseudo random) 
		 * 난수표 
		 * Math.random(); => 0.0부터 1.0 미만의 double타입의 실수를 반환
		 * Random 클래스(객체)를 사용
		 */
//		공식 (int)(Math.random() * 9) + 0
		Random random = new Random();
		int num1 = random.nextInt(6)+1;
		int num2 = random.nextInt(6);
		int num3 = random.nextInt(6)-1;
		int num4 = random.nextInt(999);
		int num5 = random.nextInt(999);
		int num6 = random.nextInt(999);
		int num7 = random.nextInt(999);
		int num8 = random.nextInt(999);
		/* 보안 강화 랜덤 SecureRandom 
		*/ 
		
		System.out.printf("%d %d %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6, num7, num8);
	}
}