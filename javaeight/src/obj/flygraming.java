package obj;

public class flygraming {

	private int myVar; // private 변수

	public void setMyVar(int myVar) { // public setter 메소드
		this.myVar = 10;
	}

	public int getMyVar() { // public getter 메소드
		return this.myVar;

	}

	int x;

	public void m() {
	}

	public static void main(String[] args) {
		flygraming gg = new flygraming();
		gg.myVar = 20;
		gg.m();// 이 클래스 안에는 static 이 없어서 서로 참조가 안되기에 객체를 따로만들면 가능
		System.out.println(gg.myVar);
	}
}