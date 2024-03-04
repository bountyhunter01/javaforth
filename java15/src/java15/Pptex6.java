package java15;

interface Ineff {
	static void forhand() {
		System.out.println("move into");// private 쓰면 중복되도 가능
		System.out.println("hitting s fordhands");
		System.out.println("move back into ready");
	}

	default void backhand() {
		System.out.println("move into");
		System.out.println("hitting back");
		System.out.println("mvoe back  rad");
	}
}

interface Efficient {

	private static void hit(String stroke) {
		System.out.println(stroke+" move into ");
//		System.out.println("hitting back");
		System.out.println("mvoe back  rad\n");
	}

	default void backhand() {
		hit("backhand");
	}// 인스터스에서 static은 부를수 있다

	static void forhand() {
		hit("volley");
	}

}

public class Pptex6 implements Efficient {

	public static void main(String[] args) {
		new Pptex6().backhand();
		Efficient.forhand();
	}

}
