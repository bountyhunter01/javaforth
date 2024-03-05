package Practice;

/**
 * 자연수 중에 3과 5의 배수의 총합 1000미만의
 */

public class Multiples {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;

			}
		}
		for (int i = 1; i < 1000; i++) {
			if (i % 15 == 0) {
				sum -= i;
			}
		}
		System.out.println("총합:" + sum);
	}

}
