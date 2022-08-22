package exercise.java;

public class exercise10 {
	public static void main(String[] args) {

		String value = "123420000o";
		char ch = ' ';
		boolean isNumber = true;

		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for (int i = 0; i <= value.length(); i++) {
			ch = value.charAt(i); // value값을 담을 수 있는 ch를 만들었으니 ch에 value값의 i번째 수를 넣는다.
			if ('0' <= ch && ch <= '9') { // ch속에 들어간 i번째 value값은 한자리 수가 되기 때문에  0~9사이에 들어있으면으로 조건을 만든다. 
				isNumber = true; // isNumber는 참이 된다.
			}else {
				isNumber = false;// 0~9 사이에 없을 경우 isNumber는 false가 된다.
				break; // 0~9사이에 없을 경우 isNumber은 false로하고 반복문을 종료한다.
			}
		}
		if (isNumber) { // isNumber가 true면 숫자입니다가 나오고 false면 숫자가 아닙니다가 입력된다. 
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}// end of main
}
