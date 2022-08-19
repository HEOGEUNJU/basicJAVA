package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member2 = new Member("이순신", "adasdas");
		System.out.println(member2.name + member2.id);

		Member member3 = new Member("류관순", "Ryu");
		System.out.println(member3.id);

		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
		System.out.println(member.name);
	}
}
