package chapter0603;
//싱글톤 패턴 예제
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}