package exercise07;

import exercise08.Shape;

public class Circle extends Shape {
	// 필드
	private double radius;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	// 메소드
	public double area() {
		return Math.round(2 * radius * Math.PI*100)/100.0;	
	}
	public double perimeter() {
		return Math.round(radius*radius*Math.PI*100)/100.0;
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레: " + area() + "cm, 넓이" + perimeter() + "㎠";
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