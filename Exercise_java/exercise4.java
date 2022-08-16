package Exercise_java;

public class exercise4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int even = 0;
		boolean run = true;
		
		while(run) {
			int i =1;
			i++;
			int total = sum +even;
			if(i%2 != 0) {
				sum += i;
				
			}else if(i%2 == 0) {
				even -= i;
			}
		
	total = sum + even;
		}			
		System.out.println();
	}

}
