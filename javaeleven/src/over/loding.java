package over;

class Animal {
	public void eat() {
	}
}

class Cow extends Animal {
	public void eat() {
	} // 오버라이딩

	public void eat(String s) {//이건 다형성이 아닌다
	}// 오버로딩
}

public class loding {
	public void Calc(int x, double y) {
	}

	public void Calc() {
	}

	public void Calc(double x, int y) {
	}// 오버로딩

	public static void main(String[] args) {
		Animal aa = new Animal();
		aa.eat();
		Cow bb = new Cow();
		bb.eat("Grass");
		Animal ac = new Cow();
		ac.eat();
//    ac.eat("GG");// 상속 때문에 cow의 문자열이 못받음

		Cow cc = new Cow();
		cc.eat();
		cc.eat("kk");
	}

}
