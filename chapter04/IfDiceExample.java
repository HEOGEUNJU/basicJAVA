package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		Random random = new Random();
		int num1 = random.nextInt(6)+1;
		
//		if(num1 == 1) {
//			System.out.println("1번이 나왔습니다.");
//		}else if(num1 == 2) {
//			System.out.println("2번이 나왔습니다.");
//		}else if(num1 == 3) {
//			System.out.println("3번이 나왔습니다.");
//		}else if(num1 == 4) {
//			System.out.println("4번이 나왔습니다.");
//		}else if(num1 == 5) {
//			System.out.println("5번이 나왔습니다.");
//		}else {
//			System.out.println("6번이 나왔습니다.");
//		}
		switch(random.nextInt(6)+1){
		case 1 : System.out.println("1번");
		break;
		case 2 : System.out.println("2번");
		break;
		case 3 : System.out.println("3번");
		break;
		case 4 : System.out.println("4번");
		break;
		case 5 : System.out.println("5번");
		break;
		case 6 : System.out.println("6번");
		break;
		
			
		}
	}
}