package javasix;

public class now3 {

	public static void main(String[] args) {
		m1();
		m1("a");
		m1("a", "b");
		m1("a", "b", "c");
	}

	public static void m1(int n, String... args) {
	}

//	public static void m1(String... int n) {}

//	public static void m1(String[] args) {}
	
	public static void m1(String...args) {
		for(int i =0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println();
	}
}
