package exercise07;

public class Circle extends Shape {
	// 필드
	private double radius;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	// 메소드
	public double area() {
		return 2 * radius * Math.PI;	
	}
	public double perimeter() {
		return radius*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레: " + area() + "cm, 넓이" + perimeter() + "cm2";
	}
	
}