package Exercise_java;

public class exercise4 {

	public static void main(String[] args) {// for문으로 다시 해보기

		int odd = 0;
		int even = 0;
		boolean run = true;
		int i = 1;
		while (run) {
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			
			if (i % 2 != 0) {
				odd += i;		
			} else {
				even -= i;			
			}		
			int total = odd + even;
			if (total >= 100) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}