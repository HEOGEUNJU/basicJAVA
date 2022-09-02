package exercise07;

import exercise08.Shape;

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
		return Math.round((2*width + 2*height)*100)/100.0;	
	}
	public double perimeter() {
		return Math.round(height*width*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레: " + area() + "cm, 넓이" + perimeter() + "㎠";
	}
	@Override
	public int compareTo(Shape s) {
		if(this.perimeter()>perimeter()) {  
			return 1; // 1은 변경
		}else if(this.perimeter()>perimeter()) {
			return -1;//-1은 변경X
		}else {
			return 0;//넘어감	
		}
	}
}
