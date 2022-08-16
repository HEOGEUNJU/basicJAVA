package chapter04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'G';
		
		switch(grade) {
		case 'A' :
		case 'a' :
		case 'c' : 
		case 'd' :
		case 'f' :
		case 'g' :
		case 'G' : 
		case 'z' : 
		case '1' :
		case '2' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}
	}
}