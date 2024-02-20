package profile1;

import java.util.Scanner;


public class wowgoodcodeex {

	public static void main(String[] args) {
		int money = 0;
		int moneyin = 0;
		int moneyout = 0;
		
		Scanner start = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 츨금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int choice = start.nextInt();
			
			if (choice == 1) {
				System.out.print("예금액>");
				moneyin = start.nextInt();
				money += moneyin;
			}else if(choice==2) {
				System.out.print("출금액>");
				moneyout = start.nextInt();
				if(money- moneyout<0) {
					int nomoney= money - moneyout;
					System.out.printf("잔고부족\n부족금액: %d원\n", -nomoney);
				}else {
					money-=moneyout;
				}
				}else if(choice ==3) {
					System.out.println("잔고>"+money);
				}else {
					break;
				}
			}
		start.close();
		System.out.printf("\n프로그램 종료");
}

}
/*
 * 일단 예금 출근 잔고 를 다 변수 지정하고 선택할 수 있게 만들고 출금액 예금액 잔고 잔고부족 및 부족금액 을 else if 로 지정하고
 * 4번을 고르면 프로그램이 종류 된다는 문구와 함께 종료 시킨다
 */
