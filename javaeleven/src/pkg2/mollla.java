package pkg2;
import protectedpkg.*;

class FictionBook extends Book{
	public void doThings() {
		read();
		this.read();
		FictionBook fd = new FictionBook();
		fd.read();
		Book b = new Book();
//		b.read(); //다른 패키지여서
	}
}

class SpaceBook extends FictionBook{
	public void doThing() {
		read();
//		new Book().read(); 가족을 부른다고 다 같은 사람이 아니기에
//		new FictionBook().read();
		new SpaceBook().read();
	}
}
public class mollla {

}
