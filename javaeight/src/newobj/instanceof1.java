package newobj;



class Dog {
}

class Cat {
}

public class instanceof1 {

	public static void main(String[] args) {
		Dog hotDog = new Dog();
		Cat bedCat = new Cat();
		if(hotDog instanceof Dog) {
			System.out.println("핫도그는 맛있어");
		}
		if(bedCat instanceof Cat) {
			System.out.println("고양이는 나빠");
		}

	}

}
