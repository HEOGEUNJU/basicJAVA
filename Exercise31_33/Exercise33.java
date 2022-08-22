package exercise31_33;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요:");
		int year = scanner.nextInt();
		
//		조건 1. [year%4==0,  year%100!=0], 조건 2. year%400==0
		
	   String result = (year%400==0) ? "윤년입니다" : ((year%4==0 && year%100!=0) ?  "윤년입니다" : "윤년이 아닙니다.");
//	   !(year%100 == 0)  <= 이것도 가능
//	   String result = year%400==0 || year%4==0 && year%100!=0 ? "윤년입니다" : "윤년이 아닙니다.");
//	   -----------------------------------------------------------------------------------------------
//	   String result == "";
//	   if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//		   result = "맞습니다."
//	   } else { 
//		   result = "아닙니다."
//			year = 200;
//	   }
	   System.out.println(year + "년은"+ result);	
	}
}