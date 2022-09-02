package exercise08;


public class Triangle extends exercise08.Shape{
	//필드
	private double side;
	//생성자
	public Triangle(double side) {
	this.side = side;
	}
	//메소드
	
	public double area() {
		return Math.round(Math.sqrt(3)*side*side/4*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + perimeter() + "cm, 넓이" + area() + "㎠";
	}
	@Override
	double perimeter() {
		return Math.round(3*side*100)/100.0;
	}
	
	

}
