package java15;

interface Movable {
}

interface Spherical {
	void doSpherical();
}

interface Bounceable extends Movable, Spherical {
	void bounce();
//	default void bounce() {}2개가 동일한 결과 같지만 이코드는 바디가 있기에 구현한 부분이 존재한다고 판단

}

class Volley implements Bounceable {
	@Override
	public void doSpherical() {
	}

	@Override
	public void bounce() {
	}
}

abstract class Beachball implements Bounceable {
}// 추상은 부모를 다 구현할 필요없음
// class InterfaceIn implements Bounceable {}//이게 안되는 이유가 상속받는 친구가 구현바디가 없어서 에러

public class Pptex2 {

	public static void main(String[] args) {
		Movable mo = new Movable() {
		};
		if (mo instanceof Movable) {
			System.out.println("WOW");
		}

	}

}
