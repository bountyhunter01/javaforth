package java15;

interface I {
	static int m1() {
		return 3;
	}// 이 친구는 여기서 직접호출이라서 오버라이드가 불가

	default void m2() {
		System.out.println(56);
	}// default or static int도 타입 void도 타입
}

public class Pptex4 {

	public static void main(String[] args) {
		System.out.println(I.m1());

	}

}
