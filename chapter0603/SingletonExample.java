package chapter0603;
//싱글톤 패턴 예제
public class SingletonExample {
	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
	
	
	System.out.println(singleton1 == singleton2);
	}
}
