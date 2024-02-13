package javasix;

import java.util.Scanner;

public class now7 {
	
	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		System.out.println("숫자를 3개 입력하시오");
		int A= gg.nextInt();
		int B= gg.nextInt();
		int C= gg.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println((A%B)+(B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%B)*(B%C)%C);
	
	}

}
