package java15;

interface Moveon {
	default void move() {
		System.out.println("Moving");
	}// {}이거는 무조건있어야한다
}

class Cheetah implements Moveon {
	@Override
	public void move() {// 이것도 기본값?
		System.out.println("MOVE very fast");
	}
}

class Eleph implements Moveon {
}

public class Pptex3 {
	public static void main(String[] args) {
		Moveon cheetah = new Cheetah();
		cheetah.move();
		Moveon eleMoveon = new Eleph();
		eleMoveon.move();
	}
}
