package pptex;

public class ThrowFinally {

	public static void main(String[] args) {
		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("oops:" + e.getMessage());
		} finally {//이거 실행하지 않으려면 이거전에 프로그램 중단해야함
			
			System.out.println("this code will always run");
		}

	}

}
