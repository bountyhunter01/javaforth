package obj;

public class Dog {
	private String dogname;
	protected int age;

	public Dog(String dogname) {
		this.dogname = dogname;
	}

	public String getDogname() {
		return dogname;
	}

	public void setDogname(String Dogname) {
		this.dogname = Dogname;
	}

	void pkgprivate() {
	}
}

class Cat {
	Cat() {
	}

	public void dogaccess() {
		Dog d = new Dog("rex");
		d.setDogname("abc"); // dogname 값을 변경하는 부분
		d.age = 2;
		d.pkgprivate();
	}

}
