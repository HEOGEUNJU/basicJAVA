package exercise07;

import exercise08.Shape;

public class Triangle extends exercise08.Shape{
	//필드
	private double side;
	//생성자
	public Triangle(double side) {
	this.side = side;
	}
	//메소드
	public double area() {
		return Math.round(3*side*100)/100.0;	
	}
	public double perimeter() {
		return Math.round(Math.sqrt(3)*side*side/4*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + area() + "cm, 넓이" + perimeter() + "㎠";
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
