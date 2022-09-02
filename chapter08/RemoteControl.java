package chapter08;

public interface RemoteControl {
	int MAX_VOLUME = 10; //public을 생략해도 자동으로 public static final이 붙기 때문에 안붙이는게 정석
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}