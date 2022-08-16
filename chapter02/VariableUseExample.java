package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		//컴퓨터는 속도가 빠르다
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		//└사용자에게 보여주기 위한 값이지 계발자가 사용하는 값이 아니다
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
		 
	}
}
