package exercise08;


public class Circle extends Shape {
	// 필드
	private double radius;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	// 메소드
	public double perimeter() {
		return Math.round(2 * radius * Math.PI*100)/100.0;	
	}
	public double area() {
		return Math.round(radius*radius*Math.PI*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레: " + perimeter() + "cm, 넓이" + area() + "㎠";
	}

	
}