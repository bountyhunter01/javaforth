package example;

public class gx2 {

	public static void main(String[] args) {
		int[] ex = new int[100];
		{
			for (int i = 0; i < ex.length; i++)
				ex[i] = i + 1;
		}
		for (int i = 0; i < ex.length; i++) {
			System.out.println(ex[i] + "");
		}
	}
}
