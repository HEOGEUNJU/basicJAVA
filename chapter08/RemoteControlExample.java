package chapter08;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl control = new Television();
		control.turnOn();
		control.setVolume(5);
		
		control = new Audio();
		control.turnOn();
		control.setVolume(5);
		
		Television tv = new Television();
		RemoteControl control2 = tv;
		Searchable searchable = tv;
		control2.turnOn();
		control2.setVolume(7);
		tv.search("홍길동");
	}
}