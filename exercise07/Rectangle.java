package exercise07;

public class Rectangle extends Shape{
	//필드
	private double width;
	private double height;
	//생성자
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	//메소드
	public double area() {
		return 2*width + 2*height;	
	}
	public double perimeter() {
		return height*width;
	}

	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레: " + area() + "cm, 넓이" + perimeter() + "㎠";
	}
}
