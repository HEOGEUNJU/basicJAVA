package chapter09;

public class AnonymousSample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle() {
			@Override
			public void run() {
				System.out.println("자동차가 달린다.");
			}
		};
		vehicle.run();//얘는 메인메소드가 살아있는 동안에는 계속 쓸 수 있음
	  
		new Vehicle() {
			@Override
			public void run() {
				System.out.println("자동차가 달린다.");
			}
		}.run();//얘는 일회성 메소드--실제로 많이 쓴다.
		
	}
}
