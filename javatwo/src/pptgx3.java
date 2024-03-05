package example;

import java.util.Scanner;

public class pptgx3 {
	public static void main(String[] args) {
		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;			
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month -->");
		int month = sc.nextInt();

		System.out.println(month);

		int numDays = 0;
		if (month == JAN || month == MAR || month == MAY) {
			numDays = 31;
		} else if (month == APR || month == JUN || month == SEP) {
			numDays = 30;
		} else if (month == FEB) {
			System.out.println("Enter");
			int year = sc.nextInt();

			if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
				numDays = 29;
			} else {
				numDays = 28;
			}
		} else {
			System.out.println("invaild month" + month);
		}
		if (numDays > 0) {
			System.out.println("NumDays is" + numDays);
		}
	}
}
