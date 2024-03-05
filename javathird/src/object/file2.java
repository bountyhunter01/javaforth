package object;

import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		while(it.hasNextInt()) {//while이라 false가 나올때까지 콘솔 사용가능
		System.out.println(it.nextInt()*10000);
		}
		it.close();
	}

}
