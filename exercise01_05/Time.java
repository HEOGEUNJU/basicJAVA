package exercise01_05;

public class Time {
	// 필드(Field)
	private int hour;
	private int minute;
	private int second;

	// 생성자(Constructor)
	public Time() {
	}

	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//		setTime(hour,minute,second);
	}

	// 메소드(Method)

//	void setTime(int hour, int minute, int second) {
//		if (hour < 0 || hour > 23) {
//			hour = 0;
//		} 		
//		if (minute < 0 || minute > 59) {
//			minute = 0;		
//		}
//		if (second < 0 || second > 59) {
//			second = 0;		
//		}
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;	
//	}
	public String toString() { //toString 메소드는 모든 클래스가 가지고 있음.
		return String.format("%02d:%02d:%02d", hour, minute, second);
	} // String.format = System.out.printf 문자열로 전달하고 싶으면 format 사용
}