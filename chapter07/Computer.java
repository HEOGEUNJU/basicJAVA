package chapter07;

public class Computer extends Calculator {
	
	@Override //<= 어노테이션을 쓰면 부모와 메소드의 이름이 다르면 오류가 뜬다. 아니면 안뜸
	public double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * radius * radius;
	}
}
