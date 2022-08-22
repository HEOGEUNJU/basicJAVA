package chapter0603;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	int multiply(int x, int y) {
		return x*y;
		
	}
	
	void print() {
		System.out.println("print");
	}
	void run() {
		print();
		System.out.println();
	}	
	public static void main(String[] args) {
		
	}
}
