package exercise41_45;

import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {

		Scanner rsp = new Scanner(System.in);
		System.out.println("가위바위보게임");
		System.out.print("철수 : ");
		String cheolsu = rsp.nextLine();
		System.out.print("영희 : ");
		String younghi = rsp.nextLine();

		String result = "";
		if (cheolsu.equals(younghi)) {
			result = "비김";
		} else if (cheolsu.equals("바위") && younghi.equals("보") 
				|| cheolsu.equals("가위") && younghi.equals("바위")
				|| cheolsu.equals("보") && younghi.equals("가위")) {
			result = "영희 승리";
		}else {
			result = "철수 승리";			
		}
		System.out.println("결과 : " + result);
	}
}