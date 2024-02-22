package instance;

class Machine {
	void on() {
		System.out.println("Machin on");
	}
}

 class Tractor extends Machine {

	@Override
	void on() {
		System.out.println("Tractor on");
	}

	static void drive() {
		System.out.println("Tractor drive");
	}

}

public class Upcasting {
//상속 때문에 업캐스팅이 가능 명시 할 필요 없음
	public static void doAction(Machine machine) {
		machine.on();// 이 친구 때문에 업캐스팅했을때 재정의 된 친구가 있어서 그친구만 출력
		// 만약에 매개변수를 부모가 아닌 자식으로 바꿔서 실행할려고하면 전환(convert)가 안됌
	}// static 때문에 먼저 실행돼서 on 매서드가 실행된건데 static 뺴면 외부에서 읽을 수 없기에 무조건 넣어야한다

	public static void main(String[] args) {
		Machine mt = new Machine();
		doAction(mt);

		doAction(new Tractor());
//		Tractor.drive();
		// 또는
//	 doAtion 매서드 안에	if(machine instanceof Tractor t) {
//        t.drive();
	}

}
