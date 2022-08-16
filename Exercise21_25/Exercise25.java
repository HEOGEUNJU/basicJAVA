package Exercise21_25;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		String strNum1 = scanner.nextLine();
		System.out.print("100원짜리 동전의 갯수: ");
		String strNum2 = scanner.nextLine();
		System.out.print("50원짜리 동전의 갯수: ");
		String strNum3 = scanner.nextLine();
		System.out.print("10원짜리 동전의 갯수: ");
		String strNum4 = scanner.nextLine();
		
		int Num1 = Integer.parseInt(strNum1);
		int Num2 = Integer.parseInt(strNum2);
		int Num3 = Integer.parseInt(strNum3);
		int Num4 = Integer.parseInt(strNum4);
		
		int tol1 = Num1*500;
		int tol2 = Num2*100;
		int tol3 = Num3*50;
		int tol4 = Num4*10;
		
		int result = tol1 + tol2 + tol3 + tol4;
		
		
				
		System.out.println("저금통 안의 동전의 총 액수: " + result );

	}
}