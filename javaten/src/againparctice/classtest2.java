package againparctice;

import java.util.Scanner;

public class classtest2 {
	
	private String major;
	private int classnum;
	
	public void  setclass(String major1) {
		this.major=major1;
	}
	public String getclass() {
		return major;
	}
	public void  setnum(int num) {
		this.classnum=num;
	}
	public int getnum() {
		return classnum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		classtest2 student1 = new classtest2();
		
		System.out.println("학과 입력: ");
		String major = sc.nextLine();
//		student1.setclass(major);
		
		System.out.println("학번 입력: ");
		int classnum = sc.nextInt();
		System.out.println("저는 "+major+" "+classnum+"학년 입니다");
	}

}
