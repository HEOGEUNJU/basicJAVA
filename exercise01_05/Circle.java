package exercise01_05;

public class Circle {

	//필드
		private double radius;
		private double X;
		private double Y;
		private double Area;
		
		//생성자		
		Circle(){
			
		}
		
		
		
		
		//메소드	
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			if(radius<0) {
				this.radius = 0;
				return;
			} else {
				this.radius = radius;
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
			this.Area = Math.PI*(radius*radius);
			return Area;
		}
	
}
