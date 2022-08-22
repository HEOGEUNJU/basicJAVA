package chapter0603;

public class CalculatorExample {
	public static void main(String[] args) {
		//원의 넓이 구하기
		//반지름 10	
		Calculator calculator = new Calculator();
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		int result4 = calculator.multiply(10,5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
				
	}
}
