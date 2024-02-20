package protectedpkg;

public class Book {
protected void read() {}
//	protected String read;
class NonfictionBook extends Book{
	public void doThings() {
		read();
	}
}
class Magnifier{
	void magnify() {
		Book b = new Book();
		b.read();
	}
}
	
	public static void main(String[] args) {
       
	}

}
