package javasix;

import java.util.Scanner;

public class now {

	public static void main(String[] args) {
		System.out.println("입력하시오=");
		Scanner cal = new Scanner(System.in);
		int you = cal.nextInt();
		for (int i = 1; i <= 9; i++) {
			  
			System.out.println(i +" x "+you+"="+you*i );
			
			
		}
		cal.close();
	}

}
