package exercise01_05;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;
	
	// 생성자
	Time() {
		}

	Time(int hour, int minute, int second) {
//		if (hour < 0 || hour > 23) {
//			hour = 0;
//		} 
//		
//		if (minute < 0 || minute > 59) {
//			minute = 0;
//		
//		}
//		if (second < 0 || second > 59) {
//			second = 0;
//		
//		}
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
		setTime(hour,minute,second);
	}
	

	// 메소드

	void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			hour = 0;
		} 		
		if (minute < 0 || minute > 59) {
			minute = 0;		
		}
		if (second < 0 || second > 59) {
			second = 0;		
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;	
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}