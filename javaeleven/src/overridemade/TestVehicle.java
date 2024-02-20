package overridemade;

class Vehicle {
public void move() {
	System.out.println("Vehicle::move");

//	public String toString() {
//		return "Vehicle::toString()";
	}
public void doAction(Vehicle vehi) {
	vehi.move();
}

	public static class Car extends Vehicle {

		@Override
		public  String toString() {
			return "Car []";
		}
//		@Override
//		public void move() {
//			System.out.println("Car입니다");
//		} 

		}
	

	public static class Boat extends Vehicle {

		@Override
		public String toString() {
			return "Boat []";
		}

		
		
	}

	public static class Saloon extends Car {

		@Override
		public String toString() {
			return "Saloon []";
		}
	}

	public static class Convertible extends Car {

		
	}//staic이 없으면 외부에서 직접 접근이 불가하기에 static을 달았다
}

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehi = new Vehicle();
		System.out.println(vehi.toString());
		
		Vehicle.Car car = new Vehicle.Car();//그냥 car만 다니까 어디에있는지 모르는듯하다
//		System.out.println(car);
		car.move(); //콘솔창과 문자열의 차이로 콘솔로 재정의 하지않았기에 부모의 것이 출력
		
		Vehicle.Saloon sal = new Vehicle.Saloon();
		System.out.println(sal);
		
		Vehicle.Convertible con = new Vehicle.Convertible();
		System.out.println(con);
		
		System.out.println(new TestVehicle().toString());
	}

}
