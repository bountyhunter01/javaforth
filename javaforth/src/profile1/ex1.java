package profile1;

public class ex1 {

	public static void main(String[] args) {
		
		while (true) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			//int가 없으면 인식이 안된다

			if (i + j == 5) {
				System.out.printf("(%d, %d)", i, j);
				break;
			}
			System.out.printf("(%d, %d)\n", i, j);
	}//d는 숫자가 들어갈 자리를 가르키는 것
	}
}
