package chapter04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		float sum = 0;
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			sum += x;
			
		}
		System.out.println(sum);
	}

}
