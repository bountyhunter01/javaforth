package example;

public class pptgx1 {

	public static void main(String[] args) {
		int x = 0, y = 0;
		for(int i=0; i<=10; i++)
			
		if (x+i > y) {
			System.out.println(x+i + " > " + y);
			continue;
		} else if (x < y+i) {
			System.out.println(x + " < " + y+i);
			continue;
		} else if (x == y) {
			System.out.println(x+i + " == " + y+i+" 같다");
			continue;
		}
			System.out.println(" 여기여기 ");
	}
}
