package java15;

sealed interface Driveable permits Vehicle {
	void drive();
//	default	void drive() {} 

}

sealed class Vehicle implements Driveable permits Car {
	private int wheelMode;

	Vehicle(int wheelMode2) {
		this.wheelMode = wheelMode2;
	}

	@Override
	public String toString() {
		return "Vehicle [wheelMode=" + wheelMode + "]";
	}

	public int getWheelMode() {
		return wheelMode;
	}

	public void setWheelMode(int wheelMode1) {
		this.wheelMode = wheelMode1;
	}

	@Override
	public void drive() {
		System.out.println("vechle drive");
	}
}

sealed class Car extends Vehicle permits Saloon {
	@Override
	public void drive() {
		System.out.println("car drive");
	}

	@Override
	public String toString() {
		return "Car [getWheelMode()=" + getWheelMode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Car(int wheelMode2) {
		super(wheelMode2);
	}
}

non-sealed class Saloon extends Car {
	@Override
	public void drive() {
		System.out.println("saloon drive");
	}

	public Saloon(int wheelMode2) {
		super(wheelMode2);
	}
}

class Volvo extends Saloon {
	@Override
	public void drive() {
		System.out.println("volvo drive");
	}

	public Volvo(int wheelMode2) {
		super(wheelMode2);
	}
}

public class Pptex7 {
	Vehicle[] ve = new Vehicle[2];

	public static void main(String[] args) {
		new Saloon(2) {
			@Override
			public void drive() {
				System.out.println("need you");
			}

		}.drive();// 재정의하고 호출을 따로 해야함

		Vehicle vehicle = new Vehicle(4); // 생성자를 만들면 그 타입에 맞는 값을 지정
		System.out.println(vehicle.getWheelMode());
		vehicle.drive();

		Car car = new Car(7);
		car.drive();
		Pptex7 se = new Pptex7();
		se.ve[0] = vehicle;
		se.ve[1] = car;
		System.out.println(se.ve[1]);// to String을 오버라이드 하지않으면 기본으로 생성된 to string만 나온다
		for (int i = 0; i < se.ve.length; i++) {
			System.out.println(se.ve[i] + "\n");
			break;
		}
	}

}
