package exerciseJava.java;

public class exercise11 {
	public static void main(String[] args) {
		
		int number = 72547;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp != 0) {
			result = result *10 + tmp%10;  // 변수를 담을 변수에 tmp는 number이기 때문에 일의 자리 숫자를 입력하기 위해 tmp의 나머지를 
										   // result값에 더해준다. 첫번째 계산에서는 result값은 7 두번째 계산 74 / 745 / 7452 / 74527
			tmp /= 10;		//첫번째 계산 7254 / 725 / 72 / 7 / 0 tmp값이 0이 되었기 때문에 while문을 종료한다.
			
			
			// 최종적으로 result 74527 tmp 0이 된다.
		}
		if(number == result) { // number 72547 result 74527 둘이 값이 다르기 때문에 false
			System.out.println(number + "는 회문수 입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
}