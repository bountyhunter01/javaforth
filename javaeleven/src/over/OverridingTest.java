package over;

import java.io.IOException; //없어도됌

class Dog {
	public void walk() {
		System.out.println("dog::walk");
	}

	public Dog run() {
		
		return new Dog();
	}
}

class Terrier extends Dog {
//	public void walk() {//정답임 중복때문에 주석처리
//		System.out.println();
//	}
//	private void walk() {//크기를 줄일 수 없어서 에러
//		
//	}
//	public void walk()throws IOException{}//부모 객체에서 예외처리하는 매서드를 던지고 있지않아 에러

	@Override
	public void walk() {
		System.out.println("terrier walk");
	}

	@Override
	public Dog run() {
//		return super.run();
		return new Terrier();//또 다른 정답임
	}
//	@Override public Dog run() { return new Terrier();}//정답임
}

public class OverridingTest {

	public static void main(String[] args) {
		Dog dd = new Terrier();
		dd.walk();
		
		
//		dd.run(); //틀린  표현 그래서 에러는 아니지만 출력이 위에 코드랑 같음
//		Dog Dog =dd.run(); //instance of 안쓸거면 이걸로 해도 된다
		Dog d = dd.run();
        if(d instanceof Terrier)
		 System.out.println("terrier obj");
		
	}

}
