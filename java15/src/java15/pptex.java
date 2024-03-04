package java15;

interface I2 {
	public static final int Value1 = 1;
	int Value2 = 2;

	private void m4() {
//	protected 는 안된다
	}
}

interface I3 {
	public static final int VALUE1 = 1;
	int VALUE2 = 2;
}

interface Moveable {
	String HOW = "walk";

	void move();
}

public class pptex implements Moveable {
//void move() {}
	@Override
	public void move() {
		System.out.println("Dog");
	}

	public static void main(String[] args) {
//		Moveable moveable = new Moveable() {

//			@Override
//			public String HOW {}//매서드만 오버라이드 가능

//		HOW = "walk";//기본값이 public static final이기 때문에 다른곳에서 이렇게 설정못함
		System.out.println(Moveable.HOW);
		System.out.println(HOW);
		new pptex().move();
	}

}
