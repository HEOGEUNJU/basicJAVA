package chapter07;

public class Car {

		Tire fornLeftTire = new Tire("앞왼쪽" , 6);
		Tire fornrightTire = new Tire("앞오른쪽" , 2);
		Tire backLeftTire = new Tire("뒤왼쪽" , 3);
		Tire backRightTire = new Tire("뒤오른쪽" , 4);

		int run() {
			System.out.println("[자동차가 달립니다.]");
			if(fornLeftTire.roll() == false) {stop(); return 1;}
			if(fornrightTire.roll() == false) {stop(); return 2;}
			if(backLeftTire.roll() == false) {stop(); return 3;}
			if(backRightTire.roll() == false) {stop(); return 4;}
			return 0;
			}

  void stop() {
	   
}


}
