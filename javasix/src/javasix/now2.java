package javasix;

import java.util.Scanner;

public class now2 {

	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.println("입력해-->");
		String alpa = cc.nextLine();
		for(int i=0; i<alpa.length(); i++) {
			char full=alpa.charAt((int)i); //alpa 의 문자열 중 i번쨰 문자를 선택하는 메소드
			System.out.println(full+" = "+ (int)full);
		}
		cc.close();
	}

}
