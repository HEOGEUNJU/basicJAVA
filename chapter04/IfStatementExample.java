package chapter04;

public class IfStatementExample {
	public static void main(String[] args) {

		int num = 10;
//		if(num==1) {
//			System.out.println("1");
//		} else if (num==2) {
//			System.out.println("2");
//			
//		} else if (num==3) {
//			System.out.println("3");
//			
//		} else if (num==4) {
//			System.out.println("4");
//
//		}  
		// 마지막에 else가 없어도 성립되는 경우도 있다.
		if (num == 1) {
			System.out.println("1");
		}
		if (num == 2) {
			System.out.println("2");

		}
		if (num == 3) {
			System.out.println("3");

		}
		if (num == 4) {
			System.out.println("4");

		}
		// else가 빠진 문장은 이렇게도 작성 가능하다.

	}
}