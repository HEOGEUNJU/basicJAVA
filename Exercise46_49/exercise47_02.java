package exercise46_49;

import java.util.Arrays;
import java.util.Random;

public class exercise47_02 {

	public static void main(String[] args) {
		Random random = new Random();
		int num[] = {random.nextInt(45)+1, random.nextInt(45)+1, random.nextInt(45)+1,
				     random.nextInt(45)+1, random.nextInt(45)+1, random.nextInt(45)+1,
				     random.nextInt(45)+1};
		Arrays.sort(num);
		for (int i = 0; i < 6; i++) {
			if(num[i]==num[i+1]) {
				num[i] = random.nextInt(45)+1;
			}
			
	
		System.out.println(num[i]);
		}
	}
}

