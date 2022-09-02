package exerciseJava.java;

public class exercise7 {
//각 변들의 최대값 구하기
	public static void main(String[] args) {
		String str = "12345";

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			int a = str.charAt(i) - '0'; 
			/*
			 * char값을 int로 바꿔주는 함수 
			 * 질문 : Character.getNumericValue를 모르는 상태에서는 charAt(i)는 어떻게 결과를 도출해야 하는지.
			 * string 값을 한글자씩 추출해주는 함수 두개가 합쳐지니 한글자씩 추출한 값을 
			 * int값으로 바꿀 수 있으니 a의 총합을 구하면 된다.
			 */
			sum += a;

		}
		System.out.println("sum=" + sum);

	}
}
