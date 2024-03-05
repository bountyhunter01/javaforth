package Practice;

import java.util.Random;
import java.util.Scanner;

/**
 * 0에서 9까지의 숫자 중 3개를 랜덤으로 생성 합니다. (각 숫자는 고유해야 합니다.) 사용자는 3자리의 숫자를 추측합니다. 숫자와 위치가
 * 모두 맞으면 '홈런', 숫자만 맞고 위치가 틀리면 '볼', 숫자와 위치가 모두 틀리면 '스트라이크'입니다. 사용자는 3번의 '스트라이크'
 * 기회를 가집니다. 3번 '스트라이크'가 되면 게임은 종료됩니다. 3개의 숫자를 모두 맞추면 ('홈런'을 얻으면) 게임이 종료됩니다. 무엇도
 * 맞추지 못하면 '아웃'이 됩니다. 잘못된 입력 (3자리가 아니거나, 숫자가 아닌 경우 등)을 하면 '경고'를 받습니다.
 */



public class BaseballGame {
	public static final int In_Num = 3;
	private static int[] comInput = new int[In_Num];// 정답숫자
//	private static int[] myInput = new int[In_Num];// 안씀

	private static int[] remove(int[] array, int index) {// 중복을제거하기 위한 매서드
		int[] result = new int[array.length - 1];

		for (int i = 0; i < index; i++) {
			result[i] = array[i];
		}
		for (int i = index; i < result.length; i++) {
			result[i] = array[i + 1];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] NumArray = { 0,1,2,3,4,5,6,7,8,9 };
		Random r = new Random();

		for (int i = 0; i < comInput.length; i++) {
			int ranNum = r.nextInt(NumArray.length);
			comInput[i] = NumArray[ranNum];
			NumArray = remove(NumArray, ranNum);// 중복제거

		}
		int b = 0;// 볼
		int homerun = 0;// 홈런
		int out = 0;// 아웃

		System.out.println("\nq(≧▽≦q)||(|||BaseBall Game Start|||)||q(≧▽≦q)\n");
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("------------------------------------------------");
				System.out.println("서로 다른 0~9숫자" + In_Num + "자리 숫자를 입력하시오");
				System.out.println("아웃 카운트:" + out);
				System.out.println("------------------------------------------------");

				System.out.println("1번째숫자를 입력하시오");
				int firstNum = sc.nextInt();
				System.out.println("2번째숫자를 입력하시오");
				int secondNum = sc.nextInt();
				System.out.println("3번째숫자를 입력하시오");
				int ThirdNum = sc.nextInt();
				if (firstNum == NumArray[firstNum] && secondNum == NumArray[secondNum]
						&& ThirdNum == NumArray[ThirdNum]) {
					System.out.println("홈런");
					homerun = homerun + 1;
					//볼
				} else if (firstNum != NumArray[firstNum] || firstNum == NumArray[secondNum]
						|| firstNum == NumArray[ThirdNum]) {
					System.out.println("볼:" + b);
					b = b + 1;
				} else if (secondNum != NumArray[secondNum] || secondNum == NumArray[firstNum]
						|| secondNum == NumArray[ThirdNum]) {
					System.out.println("볼:" + b);
				} else if (ThirdNum != NumArray[ThirdNum] || ThirdNum == NumArray[secondNum]
						|| ThirdNum == NumArray[firstNum]) {
					System.out.println("볼:" + b);
					//아웃
					
				} if (firstNum != NumArray[firstNum] && firstNum != NumArray[secondNum]
						&& firstNum != NumArray[ThirdNum]) {
					System.out.println("스트라이크" + out);
					out = out + 1;
				} else if (secondNum != NumArray[firstNum] && secondNum != NumArray[secondNum]
						&& secondNum != NumArray[ThirdNum]) {
					System.out.println("스트라이크" + out);
				}else if (ThirdNum != NumArray[firstNum] && ThirdNum != NumArray[secondNum]
						&& ThirdNum != NumArray[ThirdNum]) {
					System.out.println("스트라이크" + out);
					
				}if(out==3) {//게임 끝
					System.out.println("3아웃!! 패배ㅜㅜ");
					System.out.println("(っ °Д °;)っ||(|||Game Over|||)||\n");
					break;
				}if(homerun ==1) {//게임 승리
					System.out.println("홈런!! 승리했다!");
					System.out.println("(っ °Д °;)っ||(|||Game Over|||)||\n");
					break;
				}
				System.out.println("("+NumArray[firstNum]+") ("+NumArray[secondNum]+") ("+NumArray[ThirdNum]+")");
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다 다시 시작해보세요");
			System.out.println(e.getStackTrace());
		}
	}
}
