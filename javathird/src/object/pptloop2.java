package object;

import java.util.Scanner;

public class pptloop2 {

	public static void main(String[] args) {
		int sum=0;
		boolean keep=true;
		do {
			Scanner sx= new Scanner(System.in);
			System.out.println("Enter-->");
			int n =sx.nextInt();
			if(n<5) {
				keep= false;
			}else {
				sum+=n;
			}
			sx.close();
		}while(keep);
	
		System.out.println("Sume: "+sum);
		
	}

}
