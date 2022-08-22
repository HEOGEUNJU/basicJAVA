package exercise21_25;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m):");
		String strWidth = scanner.next();
		System.out.print("세로의 길이는?(단위: m):");
		String strHeight = scanner.next();
		//처리
		double Width = Double.parseDouble(strWidth) ;
		double Height = Double.parseDouble(strHeight);
		double area = Width * Height;
		double perimeter = (Width + Height) * 2;
		//출력
		System.out.println("직사각형의 넓이: " + area );
		System.out.println("직사각형의 둘레: " + perimeter);
	
	}
}
// 컴퓨터는 데이터 입력 => 처리 => 출력
