package exercise01_05;

public class Circle {

	// 필드
	private double radius;
	private double X;
	private double Y;
	
	// 생성자
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	// 메소드
	
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {			
			this.radius = radius; // 0보다 작아도 어차피(anyway) 초기값이 0이기 때문에 따로 안적어도됨.
		}
	}

	public double getX() {
		return X;
	}

	public void setX(double X) {
		this.X = X;
	}

	public double getY() {
		return Y;
	}

	public void setY(double Y) {
		this.Y = Y;
	}

	public double getArea() {
		return  Math.PI * (radius * radius);
		
	}

}
