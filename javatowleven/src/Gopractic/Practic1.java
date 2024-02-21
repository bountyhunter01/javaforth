package Gopractic;

enum Zoo {// enum 이 아니면 이런식으로 못만듬
	CAT, LION, DOG, HUMAN
//	String lion;
//	Zoo lion;
//	Zoo dog;
//	Zoo humen;
}

public class Practic1 {
	public void AnimalSounds(Zoo as) {
		switch (as) {
		case CAT:
			System.out.println("Meow");
			break;//이거 해야함
		case LION:
			System.out.println("어흥");
			break;
		case DOG:
			System.out.println("멍멍");
			break;
		case HUMAN:
			System.out.println("hello");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		Practic1 pra = new Practic1();
		pra.AnimalSounds(Zoo.CAT);
		pra.AnimalSounds(Zoo.LION);
		pra.AnimalSounds(Zoo.DOG);
		pra.AnimalSounds(Zoo.HUMAN);
	}

}
