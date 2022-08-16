package chapter05;

public class confirm04 {
	public static void main(String[] args) {
		int max = 0; //초기값이 가장 작은 값으로 설정해야한다.
		int min = Integer.MAX_VALUE; //초기값이 가장 큰 수로 설정해야한다. 
		int[] array = { 9, 5, 3, 8, 4 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if(array[i] <= min){
				min = array[i];
			}
		}

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
