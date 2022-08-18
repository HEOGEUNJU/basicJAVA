package chapter05;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		String today = null;
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = "일요일";
			break;
		case 2:
			today = "월요일";
			break;
		case 3:
			today = "화요일";
			break;
		case 4:
			today = "수요일";
			break;
		case 5:
			today = "목요일";
			break;
		case 6:
			today = "금요일";
			break;
		case 7:
			today = "토요일";
			break;
		}
		System.out.println("오늘 요일 : " + today);
		if (today == "일요일") {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
