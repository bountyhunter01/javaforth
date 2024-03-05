package example;

import java.util.Scanner;//자바 패키지에 있는 스캐너 클래스를 가져오라는 뜻

public class pptgx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in 키보드를 입력하라는 뜻
		System.out.println("Enter-->");
		String sport = sc.next();
		switch (sport) {
		case "Soccer":
			System.out.println("i play go");
			break;
		case "Rugby":
			System.out.println("i play gogog");
			break;
		default:
			System.out.println("Un sport");
			break;
		}
	}

}
