package classmade;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		/**
		 * 컴이 랜덤숫자 1~100까지 숫자를 저장
		 *  사람이 그 숫자를 맞출때 까지 반복하는 코드
		 */
//		Scanner gg = new Scanner(System.in);
//		System.out.println("정답을 맞춰보세요");
//		int num = gg.nextInt();
//
//		int computer = (int) (Math.random() * 10) + 1;
//
//		while (num <= computer) {
//			if (num != computer) {
//				System.out.println("틀렸습니다 다시 도전하세요");
//				continue;
//			}
//			if (num == computer) {
//				System.out.println("축하합니다 정답입니다");
//				break;
//			}
//		}
		int count =0;//횟수
		int computer = (int)(Math.random()*100)+1;//정답
		
		Scanner gg= new Scanner(System.in);
		
		
		while(true) {
			System.out.println("정답을 맞춰봐");
			int num = gg.nextInt();//내 정답존
			count++;
			
			if(num<computer) {
				System.out.println("더 큰수를 써야해");
			}else if(num>computer) {
				System.out.println("더 작은수를 써야해");
			}else if(num==computer) {
				System.out.println("정답이야");
				System.out.println(count+"번 만에 맞춰습니다");
				
				break;
			}if(num>100) {
				System.out.println("100을 초과 했습니다 다시입력하시오");
				continue;
			}
		}gg.close();
		
	}

}
