package exercise07;

public class Triangle extends Shape{
	//필드
	private double side;
	//생성자
	public Triangle(double side) {
	this.side = side;
	}
	//메소드
	public double area() {
		return 3*side;	
	}
	public double perimeter() {
		return Math.sqrt(3)*side*side/4;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + area() + "cm, 넓이" + perimeter() + "㎠";
	}
}
