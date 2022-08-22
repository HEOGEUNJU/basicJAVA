package exercise21_25;

import java.util.Scanner;

public class Exercise25_2 {

	public static void main(String[] args) {
//		입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		int Num1 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int Num2 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int Num3 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int Num4 = scanner.nextInt();
		
//		처리
		int tol1 = Num1*500;
		int tol2 = Num2*100;
		int tol3 = Num3*50;
		int tol4 = Num4*10;
		
		int result = tol1 + tol2 + tol3 + tol4;
		
		
//		출력				
		System.out.printf("저금통 안의 동전의 총 액수: " + result);
		
		
		

 
		
	
	}
}