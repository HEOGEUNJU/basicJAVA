package Exercise_java;

public class exercise8_02 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int[] number = new int[5]; // num을 한자리씩 나눌 수 있는 배열을 만든다

		for (int i = 0; i < number.length; i++) { // for을 통해 한자리씩 산출한다.
			number[i] = num % 10; // num의 10으로 나눈 나머지를 구한다 ==> 첫번째 : 5 두번째 :4 ~~~
			num = num / 10; // 첫번째를 구했으니 다음번째를 구하기 위해 정수 num에 10을 나눈다. 12345 / 10 = 1234이기 때문에
			sum += number[i];// i가 0일 때 1의 자리 구했으니 반복되다 보면 각 자리의 숫자를 추출할 수 있다.

		}

		System.out.println("sum=" + sum);

	}
}
