package exercise.java;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year= scanner.nextInt();
		if(year/400) {
			System.out.println("true");
		}else {
			System.out.println("false");
	
		}
		
	}

}
