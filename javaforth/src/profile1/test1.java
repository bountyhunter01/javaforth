package profile1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner es = new Scanner(System.in);
		
		/*System.out.println("당장 숫자 입력해=");
		int num = es.nextInt();
		if (num>=50) {
			System.out.println(num+"= 50이상의 수 라니까");
		}else if(num<50) {
			System.out.println(num+"= 50미만의 바보 수 라니까");
		}*/
		
		System.out.println("당장 숫자 입력해=");
		String gg="50미만의 바보라니까";
		int num = es.nextInt();
		if (num>=50) {
			gg = "50이상의 한 자릿 수 야";
		}
			System.out.println("값은: "+ gg);
		
		es.close();
	}//결과는 같지만 이렇게도 나올 수 있다는게 중요

}
