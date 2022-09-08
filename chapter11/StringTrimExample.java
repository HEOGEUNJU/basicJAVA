package chapter11;

public class StringTrimExample {

	public static void main(String[] args) {
		// 중간 공백은 제거하지 않는다. 앞 뒤로만 자른다
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
