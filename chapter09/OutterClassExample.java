package chapter09;

import chapter09.OutterClass.InnerClass;

public class OutterClassExample {
	public static void main(String[] args) {
		InnerClass inner = new OutterClass(). new InnerClass();
		inner.setInnerField(100);
		System.out.println(inner.getInnerField());
		
		new OutterClass.StaticInnerClass();
		
	}
}
