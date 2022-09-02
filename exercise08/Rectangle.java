package exercise08;


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
	public double perimeter() {
		return Math.round((2*width + 2*height)*100)/100.0;	
	}
	public double area() {
		return Math.round(height*width*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레: " + perimeter() + "cm, 넓이" + area() + "㎠";
	}
	
}
