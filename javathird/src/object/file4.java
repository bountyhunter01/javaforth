package object;


import java.util.Scanner;

public class file4 {

	public static void main(String[] args) {
		
		Scanner it = new Scanner(System.in);
		for (int i = 0; i <= 100; i++) {
			
		if (i <= 10){
			i++;
			System.out.println(it.nextInt() %4);
		}
		else
			System.out.println(it.nextInt() *1);
			}it.close();
		
		}
	}


