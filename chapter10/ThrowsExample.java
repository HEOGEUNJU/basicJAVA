package chapter10;

public class ThrowsExample {

	public static void main(String[] args)  {
		
		try {
			mathod1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void mathod1() throws Exception {

		Class.forName("java.lang.String");

	}

}
