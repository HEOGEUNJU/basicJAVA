package exercise01_05;

public class Car {
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	//생성자
	public Car(){		
	}
	public Car(String color){
		this.color = color ;
	}
	
	//메소드 
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean speedUp(double speed) {
		double d = speed + this.speed;
		if(d >= 0 && d <= MAX_SPEED) {
			this.speed = d;
			return true;
		}
			return false;
		
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public String toString() {
		return String.format("%d", speed);
	}
}

