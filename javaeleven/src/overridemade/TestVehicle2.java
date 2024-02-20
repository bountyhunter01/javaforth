package overridemade;

class Vaa {
	double cost = 100.0;
	static int age = 1;

	public void move() {
		System.out.println("vehicle::move()");
	}

	public static void sm() {
		System.out.println("Vehicle::sm()");
	}
}

class Car extends Vaa {//hiding
	double cost = 20_000.0;
	static int age = 2;
	public Car() {//show
        super.cost = 20000.0;  // Vehicle 클래스의 'cost' 필드 값을 변경합니다.
    }
	
	@Override
	public void move() {
		System.out.println("Car move");
	}
	
}

public class TestVehicle2 {

	public static void main(String[] args) {
		Vaa v = new Car();
		System.out.println(v.cost);//클래스
		System.out.println(Vaa.age);//static
	}

}
