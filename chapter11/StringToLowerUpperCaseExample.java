package chapter11;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
				
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		String str3 = new String("Java");
		String str4 = new String("Java");
		System.out.println(str3==str4);

		String str5 = "Java";
		String str6 = "Java";
		System.out.println(str5==str6);
	
	}

}
