package Exercise46_49;

public class exercise46 {
	public static void main(String[] args) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		int[] array = { 38,94,16,3,76,94,82,47,59,8 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
