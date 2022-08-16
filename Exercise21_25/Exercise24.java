package Exercise21_25;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm):");
			double Radius = scanner.nextDouble();
			System.out.print("원기둥의 높이을 입력하시오.(단위: cm):");
			double Height = scanner.nextDouble();
			
		
			double result = Math.PI*Radius*Radius;
			double result2 = result*Height;
			
			System.out.println("원기둥 밑변의 넓이는" + result + "cm²이고, 원기둥의 부피는 " + result2 +"cm³이다." );
				
	}
}