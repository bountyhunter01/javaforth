package pptex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TokensandDelimeters {

	public static void usingKey() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		System.out.println(sc.next() + " ");
		System.out.println(sc.next());
	}

	public static void usingFill() {
		try {// 없는 파일 만들어서 보여주는 예제
			Scanner sc1 = new Scanner(new File(System.getProperty("user.dir")));
			if (sc1.hasNextInt()) {
				int age3 = sc1.nextInt();
				System.out.println(age3);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없어");
			e.printStackTrace();
		}
	}

	public static void usingString() {
//		String input = "함 놀아보자구~~...(*￣０￣)ノ";
		String input = "Maaike  delim  van delim Putten delim 22";//단어 뒤에 delim이 붙어야 인식
		Scanner stringsc = new Scanner(input).useDelimiter("\\s*delim\\s*");
		System.out.println(stringsc.next());
		System.out.println(stringsc.next());
		System.out.println(stringsc.next());
		System.out.println(stringsc.nextInt());
		stringsc.close();
	}

	public static void howManyObject() {
		String s ="The";
		s+=" quick";
		System.out.println(s);
		s=s.concat(" bro keep going");
		System.out.println(s);
	}

	public static void main(String[] args) {
//		usingKey();
//		usingFill();
		usingString();
		howManyObject();
	}

}
