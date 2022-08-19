package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		car1.speed = 90;
		System.out.println(car1.speed);//자바에서는 필드에 초기값이 없으면 자동으로 default 초기값으로 
									   //설정한다.
		
		Car car2 = new Car();
		System.out.println(car2.company);
		System.out.println(car2.model);
		car2.color = "파랑";
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println(car2.speed);
		
		
	}
}
