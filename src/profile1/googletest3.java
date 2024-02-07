package profile1;

import java.util.Scanner;

public class googletest3 {

	public static void main(String[] args) {
		Scanner H = new Scanner(System.in);
		
		System.out.println("학점 검색하시오 ");
		while(H.hasNext()){
		int you = H.nextInt();
		if(you>=90) {
			System.out.println("A 예유");
		}else if(you>=80) {
			System.out.println("B 예유");
		}else if(you>=70) {
			System.out.println("C 예유");
		}else {
			System.out.println("F 좀더 분발 좀 해봐");
		}H.close();
	}
		}

}
