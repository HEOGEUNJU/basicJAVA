package exercise.java;

public class exercise5 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		while (i <= 10) {
			while (j  <= i) {
//			if (j<i) {
//				System.out.print("*");			
//				if (j>i) {
//					break;
//			} 
//			}
				System.out.printf("*");
				j++;
			}
			System.out.printf("\n");
			j=0;
			i++;
		}

	}
}