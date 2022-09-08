package chapter11;

public class StringReplaceExample {

	public static void main(String[] args) {
//		자바는 Replace를 사용하면 전체가 바뀐다.
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		//replace를 사용하면 match와 search 기능이 사용된다.
	}

}
