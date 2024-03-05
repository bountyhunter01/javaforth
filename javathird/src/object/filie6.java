package object;


public class filie6 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i]/=2;
			} else {
				a[i] *= 3;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}