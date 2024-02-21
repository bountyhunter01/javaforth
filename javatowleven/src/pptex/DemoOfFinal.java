package pptex;

final class Earth {
}

//class SubEarth extends Earth{}
class Pen {
	final void write() {
	}
//	final abstract scribble();// 두 타입이 서로 맞지 않다
}

public class DemoOfFinal {
	final int ONE_YEAR = 1;// 상수 식별자로 대문자를 사용하고, 각 단어 사이는 “_”로 분리하는 것

	void print(final String name, final int age) {
//	age = age + ONE_YEAR; //불변이라 안됌
		System.out.println(name.toUpperCase());//대문자로 출력해라
		System.out.println(age);
//		name = "Alexander";
	}

	public static void main(String[] args) {
		DemoOfFinal de = new DemoOfFinal();
		de.print("Alex", 100);
	}

}
