package Exercise21_25;

public class Exercise22 {

	public static void main(String[] args) {
	
		double distance = 40e12;
		double speed = 300_000;
		
		double result = distance/speed/60/60/24/365;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + result + " 광년이다.");
		
	}
}