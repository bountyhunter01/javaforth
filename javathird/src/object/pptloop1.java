package object;

import java.util.Scanner;

public abstract class pptloop1 {

	public static void main(String[] args) {
		int sum = 0;
		boolean keep = true;
		
		while(keep) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a Number -->");
			int n = sc.nextInt();
			if(n>0) {
				keep= false;
			}else {
				sum = sum+n;
				
			}
			sc.close();
		}System.out.println("sum of ~~"+ sum);
	}

}
