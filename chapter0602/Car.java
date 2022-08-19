package chapter0602;

public class Car {
	int gas;
	// void는 리턴값이 없어도 되기 때문에 오류가 안나지만
	// boolean타입은 리턴값을 입력 안하면 오류가 난다.
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false; // 리턴이 없으면 밑에도 같이 실행되기 때문에 밑에 문장을 else로 묶어줘야한다.
		}
		System.out.println("가스가 있습니다.");
		return true; //에러를 방지하기 위해 각 타입별 리턴값을 세팅해주고 시작한다.
	}
	void run() {
		while (true) {
			if (this.gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + this.gas + ")");
				this.gas--;
			}else {
				System.out.println("멈춥니다.(gas잔량 : " + this.gas + ")");
				return; // brake와 같은 효과임(메소드를 종료시킬 때 사용)
			}			
		}		
	}
}