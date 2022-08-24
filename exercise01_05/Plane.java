package exercise01_05;

public class Plane {
	// 필드
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes; //static이 붙어 있는 필드나 메소드는 클래스의 구성원이 아님

	// 생성자  
	Plane() {
		numberOfPlanes++;
	}

	Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.setMaxNumberOfPassengers(maxNumberOfPassengers);
		// this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	// 메소드
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers >= 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		} 
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return manufacturer;

	}
}
