package javasix;

import java.util.Scanner;

public class now6 {

	public static void main(String[] args) {

		Scanner gg = new Scanner(System.in);
		System.out.println("서기연도를 입력하시오");
		int years = gg.nextInt();// 서기연도
		int otheryears = years + 543;// 불기연도

		while (true) {
			if(1000 <= years && years <= 3000) {
			System.out.println("불기 연도= " + otheryears + "입니다");
			break;
			}else {
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
		gg.close();

	}

}
