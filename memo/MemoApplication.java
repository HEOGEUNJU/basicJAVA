package memo;

import java.util.Scanner;

public class MemoApplication {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		MemoController memoController = new MemoController();
	
		MemoView view = new MemoView();
		menu : while (true) {
			//첫번째 메뉴 보여줌
			System.out.println("--------------------------------------------");
			view.init();
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1://전체 메모
				view.viewMemos(memoController);
				break;
			case 2: //메모한개
				break;
			case 3: //등록
				view.insertMemo(memoController, scanner);
				break;
			case 4: //수정
				view.updateMemo(memoController, scanner);
				break;
			case 5: //삭제
				view.deleteMemo(memoController, scanner);
				break;
			case 0:
				System.exit(0);
				System.out.println("프로그램을 종료합니다.");
//				return;
//				break menu; 셋중에 하나 사용하면됨
			}
		}
	}
}
