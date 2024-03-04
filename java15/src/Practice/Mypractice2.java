package Practice;

import java.util.Scanner;


public class Mypractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] as = new int[27];//a-z 카운트
		System.out.println("영어를 입력하세여");
	  String alpha = sc.nextLine();
		for(int i=0; i<alpha.length(); i++) {
			char ch = alpha.charAt(i);//97부터 122까지
		as[ch - 'a']++;
		}
		for(int i = 0; i<26; i++) {
			System.out.println((char)(97+i)+":"+as[i]);
		}
	}//영어를 치면 단어의 개수를 세는 프로그램

}
