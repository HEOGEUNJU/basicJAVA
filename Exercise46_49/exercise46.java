package exercise46_49;

public class exercise46 {
	public static void main(String[] args) {
//		int max = Integer.MIN_VALUE; //최소값으로 시작	
//		int min = Integer.MAX_VALUE; // 최대값으로 시작
		int[] array = { 38,94,16,3,76,94,82,47,59,8 };
		int max = array[0]; // 위의 방법은 어디 자리에 둬도 사용 가능 
							// 이 방법은 array 배열에서만 허용
		int min = array[0]; 

		for (int i = 0; i < array.length; i++) {
			//최대값
			if (array[i] > max) {
				max = array[i];
			}
			//최소값
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
