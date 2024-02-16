package obj;

public class pig {

	void testDog() {
        Dog s = new Dog("Shep");    // constructor is public
//          d.pkgPrivate();   // package-private method, error
        System.out.println(s.getDogname());
  }
}
