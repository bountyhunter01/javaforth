package profile1;

public class break1 {

	public static void main(String[] args) {
		System.out.println("i,j");
		OUTERLOOP:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break OUTERLOOP;//3을 만나면 레이블 바깥으로 나감
				}
				System.out.println(i + ", " + j);
			}

		}
	}

}
