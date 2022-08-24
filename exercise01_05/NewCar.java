package exercise01_05;

public class NewCar {
	//필드
		private double speed;
		private String color;
		private static final double MAX_SPEED = killoToMile(200);
		
		//생성자
		public NewCar(){		
		}
		public NewCar(String color){
			this.color = color ;
		}
		
		//메소드 
		public double getSpeed() {
			return mileToKilo(speed);
		}
		public void setSpeed(double speed) {
			this.speed = killoToMile(speed);
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean speedUp(double speed) {
			speed = killoToMile(speed);
			if(speed + this.speed >= 0 && speed + this.speed <= MAX_SPEED) {
				this.speed += speed;
				return true;
			}else {
				return false;
			}
		}
		public static double getMaxSpeed() {
			return mileToKilo(MAX_SPEED);
		}
		private static double killoToMile(double distance) {
			return distance/1.6;
		}
		private static double mileToKilo(double distance) {
			return distance*1.6;
		}
		public String toString() {
			return String.format("%d", speed);
		}
}
