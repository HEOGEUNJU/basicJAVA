import java.util.Scanner;

public class stringscanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫째수 ");
		String strA = scanner.nextLine();
		System.out.println("둘째수 ");
		String strB = scanner.nextLine();
		
		System.out.println(strA+strB);
		
	}
}
