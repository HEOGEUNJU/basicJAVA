package chapter05;

public enum Week {
	MONDAY(2, "월요일"), 
	TUESDAY(3, "화요일"), 
	WEDNESDAY(4, "수요일"), 
	THURSDAY(5, "목요일"), 
	FRIDAY(6, "금요일"), 
	SATERDAY(7, "토요일"), 
	SUNDAY(1, "일요일"); //ctrl+ shift+ x =>  대문자 //ctrl +shift + y => 소문자

	Week(int Code, String KoreanName){
	 this.Code = Code;
	 this.KoreanName = KoreanName;
	}
		
		
		int Code;
	String KoreanName;
	
}

enum Season {
	SPRING, SUMMER, FALL, WINTER														
}

enum HttpErrorCode {
	OK, NOT_FOUND
}// 자바에서는 상수일 때만 유일하게 언더바를 쓸 수 있다.