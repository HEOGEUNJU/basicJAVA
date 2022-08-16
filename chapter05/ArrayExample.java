package chapter05;

public class ArrayExample {
	public static void main(String[] args) {
		String[] names = new String[25];
		names[0] = "박형준";
		names[1] = "이찬형";
		names[2] = "김서빈";
		names[3] = "민경진";
		names[4] = "허근주";
		names[5] = "유나래";
		names[6] = "박시윤";
		names[7] = "최경수";
		System.out.println(names[1]==names[2]);
		
		int[] scores = new int[3];// 인트의 배열, 배열의 갯수
		scores[0] = 100;// 변수에 붙은 대괄호는 인덱스로 접근할 때 기호
		scores[1] = 85;
		scores[2] = 38;
	}
}
