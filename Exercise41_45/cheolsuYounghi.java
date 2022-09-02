package exercise41_45;

import java.util.Scanner;

public class cheolsuYounghi {

	public static void main(String[] args) {
		System.out.println("가위바위보게임");
		System.out.print("철수의 가위바위보 : ");
		Scanner scanner = new Scanner(System.in); 
			String cheolsu = scanner.nextLine();
			System.out.println("영희의 가위바위보 : ");
			String younghi = scanner.nextLine();

			String result = "";
			if (cheolsu.equals(younghi)) {
				result = "비김";
			} else if (cheolsu.equals("바위") && younghi.equals("가위") 
					|| cheolsu.equals("가위") && younghi.equals("보")
					|| cheolsu.equals("보") && younghi.equals("바위")) {
				result = "철수 승리";
			} else {
				result = "영희 승리";
			}
			System.out.println("결과 : " + result);
		}
	}


