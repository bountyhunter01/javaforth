package obj;

import java.util.Arrays;
import java.util.Scanner;

public class gamemade {

	public static void main(String[] args) {
		/**
		 * 오목 게임
		 */
		int[] page = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] page2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		Scanner om = new Scanner(System.in);
		System.out.println("흑돌 차례입니다");
		int black = om.nextInt();
		System.out.println("백돌 차례입니다");
		int white = om.nextInt();

		Arrays.fill(page, 9);
		Arrays.fill(page2, 9);

		for (int i = 0; i < page.length; i++) {
			for (int j = 0; j < page2.length; j++) {
				if (black < page[i] && black < page2[i]) {
					System.out.println(page[i] + "번째 돌입니다");
				} else {
					System.out.println("범위 밖입니다 다시 입력하시오");

				}
				if (white < page[i] && white < page2[i]) {
					System.out.println(page2[i] + "번째 돌입니다");

				} else {
					System.out.println("범위 밖입니다 다시 입력하시오");
				}
				System.out.println();
			}
		}
	}

}
