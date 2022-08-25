package chapter07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplne sa = new SupersonicAirplne();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplne.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplne.NORMAL;
		sa.fly();
		sa.land();
	}

}
