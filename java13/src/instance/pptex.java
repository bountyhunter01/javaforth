package instance;

class Parent {
	{
		System.out.println("6. parent");
	}
	static {
		System.out.println("2.parent");
	}

	Parent() {
		System.out.println("8.parent");
	}//생성자는 인스턴스보다 후순위 이기때문에 8번쨰이다

	{
		System.out.println("7.parent");
	}
	static {
		System.out.println("3. parent");
	}
}

class Child extends Parent {
	{
		System.out.println("9. child");
	}
	static {
		System.out.println("4.child");
	}

	Child() {
		System.out.println("11. child");
	}

	{
		System.out.println("10.child");
	}
	static {
		System.out.println("5.child\n");
	}

}

public class pptex {
	static {
		System.out.println("1.initiakization");
	}
	{
		System.out.println("initiali");
	}
//public class 가 메인보다 먼저 시작 된다
	public static void main(String[] args) {
		System.out.println("-->creating");
		new Child();
		System.out.println("\n-->creating");
		new Child();
//		new pptex(); //인스턴스블록은 객체화해줘야 실행된다
	}

}
