package practice2;

 interface Pet{
	void bark(); //기본값이 public 이다
}
public abstract class Robot {
	private String name;

	void move() {
		System.out.println("robot moved!!");
	}

	abstract void charging();

	public String getname() {
		return name;
	}

	public void setname(String name1) {
		this.name = name1;
	}
}
