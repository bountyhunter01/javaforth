package pptex;


public class Laptop<t> {
	private t content;

	public Laptop(t conT) {
		this.content = conT;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {

	}
//제네릭은 무엇이든 들어갈수 있다
}
