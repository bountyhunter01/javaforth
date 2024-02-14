package classmade;

import java.util.Scanner;


public class class6 {

		void login() {
			Scanner sc = new Scanner(System.in);
            
			System.out.print("## 아이디를 입력하세요: ");
			String name = sc.next();
			
			System.out.print("# 비밀번호를 입력하세요: ");
			String pp = sc.next();
			
			if(name.equals("lhee")&& pp.equals("1234")) {
				System.out.println("인증 완료");
			}else {
				System.out.println("아이디나 비밀번호가 틀렸습니다");
			}sc.close();
		}
		void check() {
			int nt = 10;
			String msg = nt< 0? "새로운 쪽지가 있습니다." :"새 쪽지가 없습니다.";
			System.out.println(msg);
		
		}
		
	

	public static void main(String[] args) {
		/**
		 * 로그인 페이지 만들기
		 */
		class6 con = new class6();

		while (true) {
			System.out.printf("#메뉴를 선택하세요 (1:로그인, 2:쪽지확인, x:종료)==>");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			switch (str) {
			case "1":
				con.login();
				break;
			case "2":
				con.check();
				break;
			case "x":
				System.exit(0);

			default:
				System.out.println("잘못 입력된 값입니다!");
			}
			sc.close();
		}
	}

}
