import java.util.Scanner;

public class practce3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디");
		String name = scanner.nextLine();

		System.out.println("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);

//		if(name.equals("java")) { <= 밑에꺼는 name에 데이터가 없을 수도 있기 때문에 그걸 방지하기 위해 저렇게 쓴다.
		if ("java".equals(name)) {
			// 비교를 하기 위해서는 데이터가 기본타입이어야 가능하다. 기본타입이 아니면 연산자를 사용하거나 결과값을 도출할 수 없다.
			// 기본타입 데이터는 연산자를 사용하고 참조타입의 데이터는 연산자를 사용하지 않는다.
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}
}
