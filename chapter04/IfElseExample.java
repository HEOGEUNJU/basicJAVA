package chapter04;

public class IfElseExample {
	public static void main(String[] args) {

		// ex) 조건이 5가지다 if{ else if{ else if{ else if{ else{
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급이 A등급 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급이 B등급 입니다.");

		}
	}
}