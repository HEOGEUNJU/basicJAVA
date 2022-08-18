package Exercise_java;

public class exercise7 {

	public static void main(String[] args) {
		String str ="12345";
		
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			int a = Character.getNumericValue(str.charAt(i)) ;
			sum += a;
			
		}
		System.out.println("sum=" + sum);
		
		
			
		}
	}
