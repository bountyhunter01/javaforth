package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
//기계를 이용해 이런저런 버그를 고치고 코드를 간추린 코드 하지만 승리조건이 넘 빡시다

public class AutherBaseballGame {
	private static final int IN_NUM = 3;
	private static int[] numArray = new int[IN_NUM];
	private static int homerun = 0;
	private static int out = 0;

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		while (set.size() < IN_NUM) {
			int num = (int) (Math.random() * 9 + 1);
			set.add(num);
		}

		Iterator<Integer> iter = set.iterator();
		for (int i = 0; i < IN_NUM; i++) {
			numArray[i] = iter.next();
		}

		System.out.println("\nq(≧▽≦q)||(|||BaseBall Game Start|||)||q(≧▽≦q)\n");
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("------------------------------------------------");
				System.out.println("서로 다른 0~9숫자 3자리 숫자를 입력하시오");
				System.out.println("------------------------------------------------");

				int[] myInput = new int[IN_NUM];
				for (int i = 0; i < IN_NUM; i++) {
					while (true) {
						System.out.println((i + 1) + "번째 숫자를 입력하시오");
						myInput[i] = sc.nextInt();

						if (myInput[i] > 9) {
							System.out.println("숫자가 너무 커요 다시 입력해봐요");
						} else {
							break;// 입력받은 숫자가 9 이하인 경우 while 루프를 빠져나갑니다. 리턴안쓰고 돌아갈려면 이게 제일낮다
						}
					}
				}

				int b = 0;
				out = 0;
				homerun = 0;
				for (int i = 0; i < IN_NUM; i++) {
					if (myInput[i] == numArray[i]) {
						homerun++;
					} else if (myInput[i] == numArray[(i + 1) % IN_NUM] || myInput[i] == numArray[(i + 2) % IN_NUM]) {
						b++;
					} else {
						out++;
					}
					System.out.print("(" + numArray[i] + ")");
				}

				System.out.println("볼: " + b);
				System.out.println("스트라이크: " + out);
				if (homerun == IN_NUM) {
					System.out.println("홈런!! 승리했다!");
					break;
				}
				if (out == IN_NUM) {
					System.out.println("3아웃!! 패배ㅜㅜ");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다 다시 시작해보세요");
			System.out.println(e.getStackTrace());
		}
	}
}