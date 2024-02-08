package Array;

public class made2 {

	public static void main(String[] args) {
		double[] re = { 7.0, 8.6, 9.9 };
		double total = 0;
		for (int i = 0; i < re.length; i++) {
			total += re[i];
		}
		double av = total / re.length;
		System.out.println(av);

		int[] res = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < res.length; i++) {
			res[i] = res[i] * 2;
			total = res[i] / 5;
			System.out.println(total);
		}
	}

}
