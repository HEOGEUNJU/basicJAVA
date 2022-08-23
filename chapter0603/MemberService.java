package chapter0603;

public class MemberService {

	// 싱글톤 패턴 예제
	public class Singleton {

		private static MemberService instance = new MemberService();

		private MemberService() {
		}

		public static MemberService getInstance() {
			return instance;
		}

		boolean login(String id, String password) {
				if (id.equals("hong")&&password.equals("12345")){
					return true;
				}
				return false;
			}

		public static logout(String id){
				return instance;
			}
	}
}