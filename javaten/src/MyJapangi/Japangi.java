package MyJapangi;

import java.util.Scanner;

///**
//* 
//* @param 자판기 만들기
//* 동전 넣기
//* 잔액 보여주기 
//* 물건 선택 버튼 클릭하기
//* 물건 뱉기
//* 
//*/
//

public class Japangi {//배열 
	private int balance = 0;
	private String[] menu = { "콜라", "사이다", "식혜", "매실", "커피", "에이드", "라떼", "생수" };
	private int[] prices = { 1200, 1200, 1500, 1500, 700, 2000, 2000, 1000 };

	public void insertCoin(int coin) {//1번 보기
		balance += coin;
		System.out.println(coin + "원을 넣었습니다. 현재 잔액은 " + balance + "원입니다.");
	}

	public void selectDrink(int choice, int quantity) {//2번 보기
		if (choice >= 1 && choice <= 8) {
			int totalCost = prices[choice - 1] * quantity;
			if (totalCost <= balance) {
				balance -= totalCost;
				System.out.println(menu[choice - 1] + "를 " + quantity + "개 선택하셨습니다. " + totalCost + "원 결제되었습니다. 현재 잔액은 "
						+ balance + "원입니다.");
			} else {
				System.out.println("잔액이 부족합니다. 현재 잔액은 " + balance + "원입니다.");
			}
		} else {
			System.out.println("잘못 눌렀습니다 다시 눌러주세요");
		}
	
	}
	public void returnChange() {//3번 보기
        System.out.println("잔돈 " + balance + "원을 반환합니다.");
        balance = 0;
    }
	

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("|콜라|  |사이다|  |식혜|  |매실|");
		System.out.println("|커피|  |에이드|  |라떼|  |생수|");
		System.out.println("|-------------------------|");
		System.out.println("|------------동전투입구-(__)-|");
		System.out.println("|-------------------------|");
		System.out.println("|------------잔액배출구-(__)-|");
		System.out.println("---------------------------");

		Scanner sc = new Scanner(System.in);
		Japangi machine = new Japangi();

		while (true) {
			System.out.println("1. 동전 넣기, 2. 음료 선택, 3. 잔돈 받기");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("동전을 넣어주세요:");
				int coin = sc.nextInt();
				machine.insertCoin(coin);
				break;
			case 2:
				System.out.println("음료를 선택해주세요 (1: 콜라, 2: 사이다, 3: 식혜, 4: 매실, 5: 커피, 6: 에이드, 7: 라떼, 8: 생수):");
				int choice = sc.nextInt();
				System.out.println("수량을 입력해주세요:");
				int quantity = sc.nextInt();
				machine.selectDrink(choice, quantity);
				break;
			case 3:
				machine.returnChange();
				System.out.println("또 이용해 주세요");
				sc.close();
				System.exit(0);
			default:
				System.out.println("잘못 눌렀습니다 다시 눌러주세요");
				break;
			}
		}
	}
}
