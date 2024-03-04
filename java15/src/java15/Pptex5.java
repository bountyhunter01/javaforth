package java15;

interface A {
	default void foo() {
		System.out.println("A=foo");
	}
}

interface B {
	default void foo() {
		System.out.println("B=foo1\n");
	}
}

public class Pptex5 implements A, B {
	@Override
	public void foo() {
		System.out.println("ppt=foo");

		A.super.foo();
		B.super.foo();
	}

	public static void main(String[] args) {
//		A.super.foo();//static이 아니라서 불가
		new Pptex5().foo();//여기서 인스턴스를 생성했기에 static없어도 사용가능
	}

}
