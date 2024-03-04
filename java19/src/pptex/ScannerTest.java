package pptex;

import java.util.Scanner;

public class ScannerTest {

	public static void usingKeyborad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		if (sc.hasNextInt()) {
			int age = sc.nextInt();
			System.out.println(age+4);
		}
//		sc.close();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter another age:");
		if (sc1.hasNextInt()) {
			int age1 = sc1.nextInt();
			System.out.println(age1/2);
		}
		sc1.close();
	}

	public static void main(String[] args) {
		usingKeyborad();
	}

}
