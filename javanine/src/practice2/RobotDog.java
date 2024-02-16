package practice2;

public class RobotDog extends Robot implements Pet {

	@Override
	public void bark() {
		System.out.println("Woof 멍~~~~");
	}

	@Override
	void charging() {
		System.out.println(getname() + "go to charging");
		//get 이랑 set이랑 같은 녀석을 간접설정한거랑 출력값이 같다
	}

	public static void main(String[] args) {
		RobotDog ro = new RobotDog();
		ro.setname("roll roskate");
		ro.bark();
		ro.move();
		ro.charging();
	}

}
