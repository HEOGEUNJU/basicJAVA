package chapter06;

public class Bike {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
    Bike(){   	
    }
    
    Bike(String model){ 
    	this(model, "은색", 250);
    }
    
    Bike(String model, String color){
    	this(model, color, 250);
    }
    
    Bike(String model, String color, int maxSpeed){
    	this.model = model;
    	this.color = color;
    	this.maxSpeed = maxSpeed;
    }
	
}
