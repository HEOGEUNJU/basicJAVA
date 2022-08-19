package Exercise_java;


public class exercise8 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;

		int[] number = new int[5];

		for (int i = 0; i < 5; i++) {
			number[i] = num % 10;
			num = num / 10;
			sum += number[i];
//			if(i==0 && number[i]==0) {
//				continue;	
//			}
		}
		System.out.println("sum : " + sum);
	}
}