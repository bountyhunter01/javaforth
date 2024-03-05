package example;

public class gx5 {
	public static String[] numBer() {
		String[] num = { "yes", "no", "싫어", "좋아", "length" };
		return num;
	}

	public static void main(String[] args) {
		String[] num = numBer();
		int i = 0;
		while (i < num.length) {
			/* i<= x  i++하면 기존값에서 1을 더한채로 출력 프린트안에 
			  들어가기에 5가 떠서 에러가뜬다
			 */
			System.out.println(num[i]);
			i++;
		}
	}
}
