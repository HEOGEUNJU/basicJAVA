package chapter08;

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	//생성자
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);	
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
