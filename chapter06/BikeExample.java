package chapter06;

public class BikeExample {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		System.out.println("bike1.company :" + bike1.company);
		System.out.println();
		
		Bike bike2 = new Bike("자가용");
		System.out.println("bike2.company :" + bike2.company);
		System.out.println("bike2.model :" + bike2.model);
		System.out.println();
		
		Bike bike3 = new Bike("자가용", "빨강");
		System.out.println("bike3.company :" + bike3.company);
		System.out.println("bike3.model :" + bike3.model);
		System.out.println("bike3.color :" + bike3.color);
		System.out.println();
		
		Bike bike4 = new Bike("택시", "검정", 200);
		System.out.println("bike4.company :" + bike4.company);
		System.out.println("bike4.model :" + bike4.model);
		System.out.println("bike4.color:" + bike4.color);
		System.out.println("bike4.maxSpeed :" + bike4.maxSpeed);
	
	}

}
