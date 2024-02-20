package profile1;

import java.util.Scanner;

public class googletest2 {

	public static void main(String[] args) {
		Scanner ja = new Scanner(System.in);

		System.out.println("입력 해보는게 어때? ");
		int number = ja.nextInt();
		if (number % 3 == 0) {
			System.out.println(number + "는 3의 배수입니다");
		} else
			System.out.println(number + "는 3의 배수가 아니다");
		ja.close();
	}

}
