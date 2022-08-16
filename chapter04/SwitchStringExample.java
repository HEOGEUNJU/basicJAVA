package chapter04;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "이사";

		switch (position) {
		case "부장":
		case "사원":
		case "학생":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("500만원");
		}
	}

}
