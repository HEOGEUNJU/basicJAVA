package chapter05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) { // i를 굳이 꺼내야 하나 싶은 생각에 향상된 for문이 나왔다.
			if(i%2 == 0) {
			sum += scores[i] + 1;
		} else {
			sum += scores[i] - 1;
		}
		// ┌향상된 for문
		for (int score : scores) {// 콜론을 기준으로 오른쪽에 있는게 배열, 자동으로 첫번째 있는 수부터 순서대로 i에 담는다.
			sum += score;

		}
		System.out.println("총합 : " + sum);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);

	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {// scores.length가 아닌 다른 수를 입력하면 그 수와 위의 경우의 수가 맞지 않으면 오류가 발생하므로
													// scores.length로 쓰는 것이 좋다.
			sum += scores[i];
		}
		return sum;
	}

}
