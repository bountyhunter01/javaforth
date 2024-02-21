package pptex;

abstract class Pencil {
	abstract void write();// {}가 필요없어
}

class CharPencil extends Pencil {
	@Override
	void write() {
		System.out.println("wow shit");
	}
}

abstract class WaterPencil extends Pencil {
}

class Graphite extends Pencil {

	@Override
	void write() {
		System.out.println("Graphite []write");
	}

}

public class Abstractmade {

	public static void main(String[] args) {
//		Pencil pp = new Pencil();//abctract는  new를 쓰지 못한다
//		Pencil pen = new Graphite();
		Pencil pen = new CharPencil();
		pen.write();
	}

}

