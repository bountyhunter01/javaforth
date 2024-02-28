package pptex;


 class SomeResoures implements AutoCloseable{//실제로 있는 추상 클래스
	public void doSomething() {
		System.out.println("Doing something");
	}

	@Override
	 public void close() {
		System.out.println("Resource 닫음");
	}
}
public class AtoClosealde {

	public static void main(String[] args) {
try(SomeResoures resoures = new SomeResoures()){
	resoures.doSomething();
}
	}

}
