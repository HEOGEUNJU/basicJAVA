package exercise08;

public abstract class Shape implements Comparable<Shape> {
	//	필드

	// 생성자
	// 메소드
	abstract double area();

	abstract double perimeter();

	@Override
	public int compareTo(Shape shape) {
		if (this.area() > shape.area()) {
			return 1; // 1은 변경
		} else if (this.area() < shape.area()) {
			return -1;// -1은 변경X
		} else {
			return 0;// 넘어감
		}
	}
}
